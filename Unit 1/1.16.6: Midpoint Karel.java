public class MidpointKarel extends SuperKarel
{
    public void run()
    {
        turnLeft();
        while(notFacingEast())
        {
            middle();
        }
    }
    
    private void middle()
    {
        if(frontIsClear())
        {
            move();
        }
        if(frontIsClear())
        {
            move();
            turnRight();
            move();
            turnLeft();
        }
        else
        {
            turnAround();
            while(frontIsClear())
            {
                move();
            }
            putBall();
            turnLeft();
        }
    }
}
