public class KarelProgram extends Karel
{
    public void run()
    {
        putInPosition();
        putInPosition();
        turnRight();
        makeFlower();
        putInPosition();
        putInPosition();
        putInPosition();
        turnRight();
        makeFlower();
        putInPosition();
    }
    
    private void makeFlower()
    {
        flower();
        flower();
        putBall();
        move();
        putBall();
    }
    
    private void flower()
    {
        putBall();
        move();
        turnRight();
    }
    
    private void putInPosition()
    {
        move();
        move();
        move();
        turnLeft();
    }
    
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
