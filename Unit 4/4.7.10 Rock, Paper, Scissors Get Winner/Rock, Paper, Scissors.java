private String getWinner(String user, String computer)
{
    // Return the proper string for the result.
    String USER_PLAYER = "User wins!";
    String COMPUTER_PLAYER = "Computer wins!";
    String TIE = "Tie";

    if(user.equals(computer)) return TIE;
    else if(user.equals("rock"))
    {
        return computer.equals("paper") ? COMPUTER_PLAYER:USER_PLAYER;
    }
    else if(user.equals("paper"))
    {
        return computer.equals("scissors") ? COMPUTER_PLAYER:USER_PLAYER;
    }
    else
    {
        return computer.equals("rock") ? COMPUTER_PLAYER:USER_PLAYER;
    }
}
