public class Staircase extends SuperKarel
{    
    public void run()
    {
        while(leftIsClear())
        {
            while(frontIsClear())
            {
                move();
                putBall();
            }
            goBack();
        }
        putBall();
        turnRight();
        while(frontIsClear())
        {
            move();
        }
        turnLeft();
    }

    private void createStep()
    {
        putBall();
        turnRight();
        if(frontIsClear())
        {
            move();
            turnRight();
            move();
        }
    }
    
    private void goBack()
    {
        turnAround();
        while(ballsPresent())
        {
            move();
        }
        createStep();
    }
}
