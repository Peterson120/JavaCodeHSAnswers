public class Factorial extends ConsoleProgram
{
    public void run()
    {
        int user = readInt("What number would you like to compute the factorial for? ");
        System.out.println(factorial(user));
    }
    
    private int factorial(int i)
    {
        if(i == 1) return 1;
        return i * factorial(i-1);
    }
}
