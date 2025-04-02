public class Actions {
    static Constants Constants = new Constants();
// 0 for right, 1 for left, 2 for up, 3 for down

    public static void move() {
        
            Constants.vertex1x+=5;
            Constants.vertex2x+=5;
            Constants.vertex3x+=5;
            Constants.vertex4x+=5;
            Constants.vertex5x-=5;
            Constants.vertex6x-=5;
            Constants.vertex7x-=5;
            Constants.vertex8x-=5;
    
    }
}