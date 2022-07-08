public class SlideKarel extends Karel
{
    public void run()
    {
        code();
        code();
        putBall();
    }
    
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void code()
    {
        putBall();
        move();
        turnRight();
        move();
        turnLeft();
    }
}
