public class KarelProgram extends Karel
{
    public void run()
    {
        while(frontIsClear())
        {
            place();
            move();
        }
        place();
    }
    
    private void place(){
        putBall();
        if(leftIsClear()) 
        {
            putBall();
        }
        else if(rightIsClear()) 
        {
            putBall();
        }
        
        if(leftIsClear() && rightIsClear())
        {
            for(int i = 0; i < 5; i++)
            {
                putBall();
            }
        }
    }
}
