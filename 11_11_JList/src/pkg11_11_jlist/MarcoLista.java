
package pkg11_11_jlist;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel; 

public class MarcoLista extends JFrame 
{
    private JList listaJListColores;
     private final String nombresColores[] = { "Negro", "Azul", "Cyan",
       "Gris Oscuro", "Gris", "Verde", "Gris Claro", "Magenta",
       "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo"};
    private final Color colores[] = { Color.BLACK, Color.BLUE, Color.CYAN,
        Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
        Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, 
        Color.YELLOW };
    
     public MarcoLista() 
     {
         super( "Prueba de JList" ); 
         setLayout( new FlowLayout() );
         
         listaJListColores = new JList( nombresColores ); 
         listaJListColores.setVisibleRowCount( 5 );
         
         listaJListColores.setSelectionMode( ListSelectionModel.SINGLE_SELECTION ); 
         
        add( new JScrollPane( listaJListColores ) ); 
        
        listaJListColores.addListSelectionListener( 
            new ListSelectionListener() 
            {
                  public void valueChanged( ListSelectionEvent evento )
                  {
                       getContentPane().setBackground(
                       colores[ listaJListColores.getSelectedIndex() ] );       
                  }       
            }
        );
     }
    
}