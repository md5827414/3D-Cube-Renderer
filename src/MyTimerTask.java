import java.util.Timer;
import java.util.TimerTask;
public class MyTimerTask extends TimerTask{
    
    public static int line1x1 =250;
  
    public void run() {
        line1x1++;
        }
    

public static void main(String args[]) {
   
    TimerTask timerTask = new MyTimerTask();
    Timer timer = new Timer();
    timer.scheduleAtFixedRate(timerTask, 2000, 100*10000);
System.out.println(line1x1);
}
   


}