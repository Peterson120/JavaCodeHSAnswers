public class RockPaperScissors extends ConsoleProgram
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    
    private String getWinner(String user, String computer)
    {
        // Return the proper string for the result.
        String USER_PLAYER = "User wins!";
        String COMPUTER_PLAYER = "Computer wins!";
        String TIE = "Tie";
    
        if(user.equals(computer)) return TIE;
        else if(user.equals("rock")) return computer.equals("paper") ? COMPUTER_PLAYER:USER_PLAYER;
        else if(user.equals("paper")) return computer.equals("scissors") ? COMPUTER_PLAYER:USER_PLAYER;
        else return computer.equals("rock") ? COMPUTER_PLAYER:USER_PLAYER;
    }

    private String getComputer(){
        int random = Randomizer.nextInt(0,3);
        if(random == 1) return "rock";
        else if(random == 2) return "scissors";
        return "paper";
    }

    public void run()
    {
        user();
    }
    
    public void user()
    {
        String str = readLine("Enter your choice (rock, paper, or scissors): ");
        if(str.equals(""))
        {
            System.out.println("Thanks for playing!");
            return;
        }
        String x = getComputer();
        System.out.println("user: "+ str);
        System.out.println("Computer: "+ x);
        System.out.println(getWinner(str, x));
        user();
    }
}
