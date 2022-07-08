// This program has Karel turn left one time for
// each tennis ball that is present
class JustKeepSpinning extends SuperKarel
{
    public void run()
    {
        move();
        while(ballsPresent())
        {
            turnLeft();
            takeBall();
        }
    }
}
