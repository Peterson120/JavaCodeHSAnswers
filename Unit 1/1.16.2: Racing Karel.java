public class RacingKarel extends SuperKarel
{
    //main
    public void run()
    {
        for(int i = 0; i < 4; i++)
        {
            place();
            check();
        }
    }
    
    //puts ball
    private void place()
    {
        for(int i = 0; i < 8; i++)
        {
            putBall();
        }
    }
    
    //move
    private void check()
    {
        while(frontIsClear())
        {
            move();
        }
        turnLeft();
    }
}
