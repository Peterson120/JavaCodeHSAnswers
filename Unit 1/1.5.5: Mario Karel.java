public class MarioKarel extends Karel
{
    public void run()
    {
        collectCoins();
        move();
        collectCoins();
        move();
        collectCoins();
        move();
        collectCoins();
    }
    
    private void collectCoins()
    {
        move();
        turnLeft();
        move();
        move();
        move();
        takeBall();
        takeBall();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
    }
}
