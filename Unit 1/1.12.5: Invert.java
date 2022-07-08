public class KarelProgram extends Karel
{
    public void run()
    {
        while(frontIsClear())
        {
            check();
            move();
        }
        check();
    }
    
    private void check()
    {
        if(ballsPresent()) 
        {
            takeBall();
        }
        else 
        {
            putBall();
        }
    }
}
