public class KarelProgram extends Karel
{
    public void run()
    {
        move();
        bush();
        bush();
    }
    
    private void bush()
    {
        move();
        move();
        putBall();
        move();
        putBall();
        turnLeft();
        move();
        putBall();
        turnLeft();
        move();
        putBall();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
    }
}
