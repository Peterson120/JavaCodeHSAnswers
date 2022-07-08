public class TwoTowersKarel extends Karel
{
	public void run()
	{
		tower();
		turnLeft();
		turnLeft();
		move();
		move();
		move();
		turnLeft();
		move();
		tower();
		turnRight();
	}
    
    private void tower()
    {
        move();
        turnLeft();
        ball();
        ball();
        ball();
    }
    
    private void ball()
    {
        putBall();
        move();
    }
    
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
