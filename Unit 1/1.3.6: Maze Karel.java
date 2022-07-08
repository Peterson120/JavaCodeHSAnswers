// This program has Karel solve the maze and find the ball
class MazeKarel extends Karel
{
    public void run()
    {
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        turnRight();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnRight();
        move();
        move();
    }
    
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
