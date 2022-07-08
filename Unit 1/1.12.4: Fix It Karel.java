public class KarelProgram extends Karel
{
    public void run()
    {
        check();
    }
    
    private void ball()
    {
        for(int i = 0; i < 4; i++) 
        {
            putBall();
        }
    }
    
    private void check()
    {
        while(frontIsClear())
        {
            if(leftIsClear())
            {
                ball();
                move();
            }
            else
            {
                putBall();
                move();
            }
        }
        putBall();
    }
}
