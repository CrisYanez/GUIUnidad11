package pkg11_5_campo_texto;

import java.awt.FlowLayout; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import javax.swing.JFrame; 
import javax.swing.JTextField; 
import javax.swing.JPasswordField; 
import javax.swing.JOptionPane; 

public class CampoTextoMarco extends JFrame {

    private JTextField campoTexto1; 
    private JTextField campoTexto3;
    private JPasswordField campoContrasenia;

    public CampoTextoMarco()
    {
        super( "Prueba de JTextField y JPasswordField" ); 
        setLayout( new FlowLayout() ); 
        
        campoTexto1 = new JTextField( 10 ); 
        add( campoTexto1 ); 
        
        campoTexto3 = new JTextField( "Que ondaa", 10 ); 
        campoTexto3.setEditable( false );
        add( campoTexto3 ); 
        
        campoContrasenia = new JPasswordField( "Texto oculto" ); 
        add( campoContrasenia ); 
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener( manejador );
        campoTexto3.addActionListener( manejador );
        campoContrasenia.addActionListener( manejador ); 
         
    }
    private class ManejadorCampoTexto implements ActionListener
    { 
        public void actionPerformed( ActionEvent evento ) 
        {
             String cadena = "";
             
              if ( evento.getSource() == campoTexto1 ) 
                  cadena = String.format( "campoTexto1: %s", evento.getActionCommand() );
              
              else if ( evento.getSource() == campoContrasenia ) 
                  cadena = String.format( "campoContrasenia: %s", new String( campoContrasenia.getPassword() ) ); 
              
              JOptionPane.showMessageDialog( null, cadena ); 
           }
        }
    }
 
