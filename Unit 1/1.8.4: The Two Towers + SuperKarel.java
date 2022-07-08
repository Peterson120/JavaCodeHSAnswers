public class TwoTowersKarel extends SuperKarel
{
	public void run()
	{
		tower();
		turnRight();
		down();
		tower();
	}
	
	private void tower()
	{
	    move();
	    turnLeft();
	    ball();
	    ball();
	    ball();
	    turnRight();
	}
	
	private void down()
	{
	    move();
	    move();
	    move();
	    turnLeft();
	    move();
	}
	
	private void ball()
	{
	    putBall();
	    move();
	}
}
