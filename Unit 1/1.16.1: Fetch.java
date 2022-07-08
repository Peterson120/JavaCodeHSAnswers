/*comments*/
public class FetchKarel extends SuperKarel
{
    public void run()
    {
        turnLeft();
        position();
        turnRight();
        ball();
        takeBall();
        turnAround();
        ball();
        turnLeft();
        position();
        putBall();
        turnLeft();
    }
    
    private void position()
    {
        for(int i = 0; i < 4; i++)
        {
            move();
        }
    }
    
    private void ball()
    {
        move();
        move();
    }
}
