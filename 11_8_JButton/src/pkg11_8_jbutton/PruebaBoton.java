
package pkg11_8_jbutton;

import javax.swing.JFrame;

public class PruebaBoton 
{
  public static void main( String args[] ) 
  {
     MarcoBoton marcoBoton = new MarcoBoton();
     marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
     marcoBoton.setSize( 450, 500 );
     marcoBoton.setVisible( true ); 
  }
}