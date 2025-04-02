
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;




public class line extends JFrame{
  static Constants Constants = new Constants();
  static Actions actions = new Actions();
     String right;
      String left;
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
          // add direction
            public void move() {
                    
                          Constants.vertex1x+=5;
                          Constants.vertex2x+=5;
                          Constants.vertex3x+=5;
                          Constants.vertex4x+=5;
                          Constants.vertex5x-=5;
                          Constants.vertex6x-=5;
                          Constants.vertex7x-=5;
                          Constants.vertex8x-=5;
            }
   public static void main(String[] args) throws InterruptedException {
                        
       line line = new line();
       for (int i = 0; i < 2000; i++) {
         undoLastLine();
         line.move();
        pause(1000);
      }
              
}
      
}

     
  
    