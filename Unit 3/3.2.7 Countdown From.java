public class Countdown extends ConsoleProgram
{
    public void run()
    {
        countdownFrom(10, 5);
    }
    
    public void countdownFrom(int start, int stop)
    {
        for(start = start; start >= stop; start--) System.out.println(start);
    }
}
