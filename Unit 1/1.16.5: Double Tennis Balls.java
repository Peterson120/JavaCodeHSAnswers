public class DoubleTennisBallsKarel extends SuperKarel
{
    public void run()
    {
        move();
        duplicate();
        moveBalls();
    }
    
    //doubles balls
    private void duplicate()
    {
        turnAround();
        while(ballsPresent())
        {
            takeBall();
            movement();
        }
    }
    
    //doubles balls
    private void movement()
    {
        move();
        putBall();
        putBall();
        turnAround();
        move();
        turnAround();
    }
    
    //moves duplicate balls
    private void moveBalls()
    {
        move();
        while(ballsPresent())
        {
            takeBall();
            turnAround();
            move();
            putBall();
            turnAround();
            move();
        }
        turnAround();
    }
}
