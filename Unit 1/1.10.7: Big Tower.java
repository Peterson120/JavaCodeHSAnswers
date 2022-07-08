/* This program draws a big tower from Karel's starting spot */
public class BigTowerKarel extends SuperKarel
{
    public void run()
    {
        faceNorth();
        frontClear();
    }
    
    private void faceNorth()
    {
        while(notFacingNorth()) 
        {
            turnLeft();
        }
    }
    
    private void frontClear()
    {
        while(frontIsClear())
        {
            putBall();
            move();
        }
        putBall();
    }
}
