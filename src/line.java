
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;




public class line extends JFrame{

  MyTimerTask timerTask = new MyTimerTask();
int line1x1 = timerTask.line1x1;

    public line() {
   
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
   } 

    public void paint(Graphics g) {
     Graphics2D g2D= (Graphics2D) g; 
    
     g2D.drawLine(line1x1,250,500,500);
       }

      
         
    
            public static void main(String[] args){
              MyTimerTask repeater = new MyTimerTask();
              repeater.run();
               line line = new line();

             
                       


}
      }
    
     
  
    