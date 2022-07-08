public class IceCream extends ConsoleProgram
{
    public void run()
    {
        System.out.println(bool(readLine("Do you like ice cream? ")));
    }
    
    private boolean bool(String x)
    {
        return x.equals("true");
    }
}
