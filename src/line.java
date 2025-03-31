
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;




public class line extends JFrame{
  static Constants Constants = new Constants();
  
      public line() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(500,500);
      this.setLocationRelativeTo(null);
      this.setVisible(true);
     } 
  
      public void paint(Graphics g) {
       Graphics2D g2D= (Graphics2D) g; 
       //left line of front square
         g2D.drawLine(Constants.vertex1x,Constants.vertex1y,Constants.vertex2x,Constants.vertex2y);
         //right line of front square
         g2D.drawLine(Constants.vertex3x,Constants.vertex3y,Constants.vertex4x,Constants.vertex4y);
         //top line of front square
         g2D.drawLine(Constants.vertex2x,Constants.vertex2y,Constants.vertex4x,Constants.vertex4y);
         //bottom line of front square
         g2D.drawLine(Constants.vertex1x,Constants.vertex1y,Constants.vertex3x,Constants.vertex3y);


         //left line of back square
         g2D.drawLine(Constants.vertex5x,Constants.vertex5y,Constants.vertex6x,Constants.vertex6y);
         //right line of back square
         g2D.drawLine(Constants.vertex7x,Constants.vertex7y,Constants.vertex8x,Constants.vertex8y);
         //top line of back square
         g2D.drawLine(Constants.vertex6x,Constants.vertex6y,Constants.vertex8x,Constants.vertex8y);
         //bottom line of back square
         g2D.drawLine(Constants.vertex5x,Constants.vertex5y,Constants.vertex7x,Constants.vertex7y);

         //connecting lines

         //top left
         g2D.drawLine(Constants.vertex2x,Constants.vertex2y,Constants.vertex6x,Constants.vertex6y);
         //top right
         g2D.drawLine(Constants.vertex4x,Constants.vertex4y,Constants.vertex8x,Constants.vertex8y);
         //bottom left
         g2D.drawLine(Constants.vertex1x,Constants.vertex1y,Constants.vertex5x,Constants.vertex5y);
         //bottom right
         g2D.drawLine(Constants.vertex3x,Constants.vertex3y,Constants.vertex7x,Constants.vertex7y);

         }
  
      public static void pause(long milliseconds) throws InterruptedException {
          Thread.sleep(milliseconds);
         }
      public static void undoLastLine() {
          line line= new line();
          line.repaint();
        }
      
      public static void main(String[] args) throws InterruptedException {
        
          line line = new line();
        // for (int i = 0; i < 10; i++) {
        //   undoLastLine();
        //   repeater.runLineOne();
        // pause(2000);
      //}
              
}
      
}

     
  
    