
package pkg11_8_jbutton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame
{
    private JButton botonJButtonSimple;
    private JButton botonJButtonElegante;
    private JButton botonJButtonElegante2;
    
    public MarcoBoton()
    {
     super( "Baile Improvisado" ); 
     setLayout( new FlowLayout() );
     
     botonJButtonSimple = new JButton( "Guerra de bailes" ); 
     add( botonJButtonSimple );
     
     Icon bailesito = new ImageIcon( getClass().getResource( "baile.gif" ) ); 
     Icon bailongo = new ImageIcon( getClass().getResource( "bailejv.gif" ) );
     
     botonJButtonElegante = new JButton( "La cucaracha", bailesito ); 
     add( botonJButtonElegante );
     
     botonJButtonElegante = new JButton( "La Matraca", bailongo ); 
     add( botonJButtonElegante );
     
     
     ManejadorBoton manejador = new ManejadorBoton();
     botonJButtonElegante.addActionListener( manejador );
     
     botonJButtonSimple.addActionListener( manejador ); 
    }
     
     private class ManejadorBoton implements ActionListener 
     {
         public void actionPerformed( ActionEvent evento ) 
         {
            JOptionPane.showMessageDialog( MarcoBoton.this, String.format( "Usted oprimio: %s", evento.getActionCommand() ) ); 
         }
     }
     }

