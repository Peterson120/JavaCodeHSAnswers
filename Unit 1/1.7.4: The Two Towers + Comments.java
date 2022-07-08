/*This Program makes two towers*/

public class TwoTowersKarel extends Karel
{
	public void run()
	{
    	move();
        buildTower();
        comeDown();
        move();
        move();
        buildTower();
        move();
        turnRight();
	}
    
    //Karel turns right
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    //Karel Turns Around
    private void turnAround()
    {
        turnLeft();
        turnLeft();
    }
    
    //Karel Goes Down
    private void comeDown()
    {
        turnAround();
        move();
        move();
        turnLeft();
    }
    
    //Karel places tower
    private void buildTower()
    {
        turnLeft();
        putBall();
        move();
        putBall();
        move();
        putBall();
    }
}
