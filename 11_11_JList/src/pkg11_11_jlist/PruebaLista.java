
package pkg11_11_jlist;

import javax.swing.JFrame;

public class PruebaLista 
{
    public static void main( String args[] ) 
    {
        MarcoLista marcoLista = new MarcoLista(); 
        marcoLista.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       marcoLista.setSize( 500, 500 ); 
        marcoLista.setVisible( true ); 
    }
}