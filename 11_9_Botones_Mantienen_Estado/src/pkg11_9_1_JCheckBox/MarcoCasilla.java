
package pkg11_9_1_JCheckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField; 
import javax.swing.JCheckBox; 

public class MarcoCasilla extends JFrame 
{
   private JTextField campoTexto; 
   private JCheckBox negritaJCheckBox; 
   private JCheckBox cursivaJCheckBox; 
   
   public MarcoCasilla() 
   {
       super( "Tipos de letra" ); 
       setLayout( new FlowLayout() ); 
       
       campoTexto = new JTextField( "Mira el cambio del estilo de tipo de letra", 22 ); 
       campoTexto.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
       add( campoTexto );
       
       negritaJCheckBox = new JCheckBox(" Negrita ");
       cursivaJCheckBox = new JCheckBox( "Cursiva" ); 
       
       add( negritaJCheckBox ); 
       add( cursivaJCheckBox ); 
       
       ManejadorCheckBox manejador = new ManejadorCheckBox();
       negritaJCheckBox.addItemListener( manejador ); 
       cursivaJCheckBox.addItemListener( manejador );
   }
   
   private class ManejadorCheckBox implements ItemListener 
   {
        private int valNegrita = Font.PLAIN;
        private int valCursiva = Font.PLAIN; 
        
        public void itemStateChanged( ItemEvent evento ) 
        {
             if ( evento.getSource() == negritaJCheckBox )
                 valNegrita =   negritaJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN; 
             
              if ( evento.getSource() == cursivaJCheckBox )
                 valCursiva =   cursivaJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
              
               campoTexto.setFont(new Font( "Serif", valNegrita + valCursiva, 14 ) );
        }
   }
}