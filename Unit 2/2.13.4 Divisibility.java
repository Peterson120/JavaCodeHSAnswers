public class Divisibility extends ConsoleProgram
{
    public void run()
    {
        int dividend = readInt("Enter the dividend: ");
        int divisor = readInt("Enter the divisor: ");
        
        
        System.out.println((divisor == 0 || dividend / divisor != (double) dividend / divisor)?dividend + " is not divisible by " + divisor:dividend + " is divisible by " + divisor + "!");
    }
}
