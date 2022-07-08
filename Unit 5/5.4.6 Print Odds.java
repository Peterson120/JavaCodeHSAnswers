public class PrintOdds extends ConsoleProgram
{
    public void run()
    {
        int[ ] values = {17, 34, 56, 2, 19, 100};
        
        for (int i:values)
        {
            if (i % 2 == 1)System.out.println(i + " is odd");
        }
    }
}
