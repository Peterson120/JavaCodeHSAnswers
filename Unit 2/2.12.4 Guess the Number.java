public class GuessTheNumber extends ConsoleProgram
{
    public void run()
    {
        String[] line = {"I'm thinking of a number between 1 and 10. ","See if you can guess the number!"};
        int secretNumber = 6,guess = 0;
        
        // Allow the user to keep guessing numbers between
        // 1 and 10 until they guess the correct number
        for(String i:line) System.out.println(i);
        
        while(true)
        {
            guess = readInt("Enter your guess: ");
            System.out.println(guess == secretNumber ? "Correct":"Try Again");
            if(guess == secretNumber) break;
        }
    }
}
