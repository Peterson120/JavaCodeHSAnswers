public class SuperCleanupKarel extends SuperKarel
{
    public void run()
    {
        while(leftIsClear())
        {
            movement();
        }
        movement();
    }
    
    //moves back to left wall
    private void back()
    {
        while(frontIsClear())
        {
            move();
        }
    }
    
    //checks if top wall is met
    private void check()
    {
        if(rightIsClear())
        {
            turnRight();
            move();
            turnRight();
        }
        else
        {
            turnLeft();
            back();
            turnLeft();
        }
    }
    
    //takes ball
    private void movement()
    {
        while(frontIsClear())
        {
            if(ballsPresent())
            {
                takeBall();
            }
            if(frontIsClear())
            {
                move();
            }
        }
        if(ballsPresent())
        {
            takeBall();
        }
        turnAround();
        back();
        check();
    }
}
