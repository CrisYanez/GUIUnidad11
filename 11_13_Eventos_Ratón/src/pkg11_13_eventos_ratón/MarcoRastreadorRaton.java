
package pkg11_13_eventos_ratón;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

 public class MarcoRastreadorRaton extends JFrame 
 {
   private JPanel panelRaton; 
   private JLabel barraEstado; 
   
   public MarcoRastreadorRaton()
   {
      super( "Demostracion de los eventos de raton" ); 
      
      panelRaton = new JPanel();
      panelRaton.setBackground( Color.WHITE ); 
      add( panelRaton, BorderLayout.CENTER );
      
      
     barraEstado = new JLabel( "Raton fuera de JPanel" ); 
     add( barraEstado, BorderLayout.SOUTH );
     
     ManejadorRaton manejador = new ManejadorRaton(); 
     panelRaton.addMouseListener( manejador ); 
     panelRaton.addMouseMotionListener( manejador ); 
   }
   private class ManejadorRaton implements MouseListener, MouseMotionListener
   {
      public void mouseClicked( MouseEvent evento ) 
      {
         barraEstado.setText( String.format( "Se hizo clic en [%d, %d]",  
                 evento.getX(), evento.getY() ) );
      }      
      
      public void mousePressed( MouseEvent evento ) 
      {
           barraEstado.setText( String.format( "Se oprimio en [%d, %d]",
            evento.getX(), evento.getY() ) );         
      }
      public void mouseReleased( MouseEvent evento ) 
      {
          barraEstado.setText( String.format( "Se solto en [%d, %d]", 
                      evento.getX(), evento.getY() ) ); 
          
      }
      public void mouseEntered( MouseEvent evento )
      {
           barraEstado.setText( String.format( "Raton entro en [%d, %d]", 
               evento.getX(), evento.getY() ) ); 
            panelRaton.setBackground( Color.BLUE ); 
      }
      public void mouseExited( MouseEvent evento ) 
      {
        barraEstado.setText( "Raton fuera de JPanel" ); 
         panelRaton.setBackground( Color.BLACK ); 
         
      }
      public void mouseDragged( MouseEvent evento ) 
      {
           barraEstado.setText( String.format( "Se arrastro en [%d, %d]", 
                 evento.getX(), evento.getY() ) ); 
           
      }
      public void mouseMoved( MouseEvent evento ) 
      {
           barraEstado.setText( String.format( "Se movio en [%d, %d]", 
               evento.getX(), evento.getY() ) );       
      }
   }
 }