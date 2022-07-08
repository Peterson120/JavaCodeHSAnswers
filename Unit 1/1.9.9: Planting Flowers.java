public class KarelProgram extends Karel
{
    public void run()
    {
        for(int i = 0; i < 2; i++)
        {
            putInPosition();
            turnLeft();
            putInPosition();
            turnRight();
            makeFlower();
            move();
            turnRight();
            putInPosition();
            turnLeft();
        }
    }
    
    private void makeFlower()
    {
        for(int i = 0; i < 4; i++)
        {
            putBall();
            move();
            turnLeft();
        
        }
    }
    
    private void putInPosition()
    {
        for(int i = 0; i < 3; i++) 
        {
            move();
        }
    }
    
    private void turnRight()
    {
        for(int i = 0; i < 3; i++) 
        {
            turnLeft();
        }
    }
}
