
package pkg11_16_teclas;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea; 

 public class MarcoDemoTeclas extends JFrame implements KeyListener 
 {
     private String linea1 = "";
     private String linea2 = "";
     private String linea3 = "";
     
     private JTextArea areaTexto; 
     
    public MarcoDemoTeclas() 
    {
        super( "Demostración de los eventos de pulsacion de teclas" ); 
        areaTexto = new JTextArea( 10, 15 ); 
        areaTexto.setText( "Oprima cualquier tecla en el teclado..." ); 
        areaTexto.setEnabled( false );
        areaTexto.setDisabledTextColor( Color.BLACK ); 
        add( areaTexto );
        
        addKeyListener( this );
    }
    
    public void keyPressed( KeyEvent evento ) 
    {
        linea1 = String.format( "Tecla oprimida: %s", 
        evento.getKeyText( evento.getKeyCode() ) );
        establecerLineas2y3( evento );  
    }
    
    public void keyReleased( KeyEvent evento )
    {
         linea1 = String.format( "Tecla liberada: %s", 
         evento.getKeyText( evento.getKeyCode() ) ); 
         establecerLineas2y3( evento ); 
    }
    
    public void keyTyped( KeyEvent evento ) 
    {
      linea1 = String.format( "Tecla oprimida: %s", evento.getKeyChar() );
      establecerLineas2y3( evento );
    }
    
    private void establecerLineas2y3( KeyEvent evento ) 
    {
        linea2 = String.format( "Esta tecla %s es una tecla de accion", 
        ( evento.isActionKey() ? "" : "no " ) );    
        
        String temp = evento.getKeyModifiersText( evento.getModifiers()); 
        
        linea3 = String.format( "Teclas modiﬁcadoras oprimidas: %s", 
         ( temp.equals( "" ) ? "ninguna" : temp ) );
        
        areaTexto.setText( String.format( "%s\n%s\n%s\n", 
            linea1, linea2, linea3 ) );      
    }
 }

