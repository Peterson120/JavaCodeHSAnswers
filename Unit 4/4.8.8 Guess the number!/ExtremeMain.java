public class ExtremeMain extends ConsoleProgram
{
    public void run()
    {
        
        // Create an Extremes object
        
        
        // Ask the user to guess the maximum value of an Integer
        int user = readInt("Guess the maximum Integer value: ");
        
        // Compute and display the difference
        // between the max and the guess
        System.out.println("You were off by " + Extremes.maxDiff(user));
        
        // Ask the user to guess the minimum value of an Integer
        user = readInt("Guess the minimum Integer value: ");
        
        // Compute and display the difference 
        // between the min and the guess
        System.out.println("You were off by " + Math.abs(Extremes.minDiff(user)));
    }
}
