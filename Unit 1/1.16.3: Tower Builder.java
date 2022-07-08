public class TowerBuilderKarel extends SuperKarel
{
    public void run()
    {
        tower();
        while(frontIsClear())
        {
            check();
        }
    }
    
    //creates tower
    private void tower()
    {
        turnLeft();
        for(int f = 0; f < 3; f++)
        {
            putBall();
            move();
        }
        down();
    }
    
    //move down from top of tower
    private void down()
    {
        turnAround();
        while(frontIsClear())
        {
            move();
        }
        turnLeft();
    }
    
    //checks if karel moves 2 spaces otherwise it breaks
    private void check()
    {
        for(int i = 0; i < 2;i++)
        {
            if(frontIsClear())
            {
                move();
            }
            else
            {
                break;
            }
        }
        if(i == 2)
        {
            tower();
        }
    }
}
