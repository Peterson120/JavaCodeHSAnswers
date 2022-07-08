public class TripleDouble extends ConsoleProgram
{
    public void run()
    {
        int points = readInt("Number of points: ");
        int rebounds = readInt("Number of rebounds: ");
        int assists = readInt("Number of assists: ");
        
        boolean tripleDouble = points >= 10 && rebounds >= 10 && assists >= 10;
        
        System.out.println("Got a Triple Double? " + tripleDouble);
    }
}
