// Follow the yellow ball road!
// Karel moves until it's not on a tennis ball.
public class YellowBallRoadKarel extends SuperKarel
{
    public void run()
    {
        while(ballsPresent()) 
        {
            move();
        }
    }
}
