
package pkg11_5_campo_texto;

import javax.swing.JFrame;

public class PruebaCampoTexto
{ 
    public static void main( String args[] )
    {  
        CampoTextoMarco campoTextoMarco = new CampoTextoMarco();
        campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        campoTextoMarco.setSize( 350, 80 ); 
        campoTextoMarco.setVisible( true );
     }
} 