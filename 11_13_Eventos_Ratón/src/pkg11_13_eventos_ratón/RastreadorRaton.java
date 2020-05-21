
package pkg11_13_eventos_ratón;

import javax.swing.JFrame;

public class RastreadorRaton {
    public static void main( String args[] ) 
    {
        MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton(); 
        marcoRastreadorRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
        marcoRastreadorRaton.setSize( 700, 700 ); 
        marcoRastreadorRaton.setVisible( true ); 
    }
}
