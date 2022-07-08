public class HurdlesKarel extends SuperKarel
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            moveToHurdle();
            jumpHurdle();
        }
    }
    
    private void moveToHurdle()
    {
        move();
        move();
    }
    
    private void jumpHurdle()
    {
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }
}
