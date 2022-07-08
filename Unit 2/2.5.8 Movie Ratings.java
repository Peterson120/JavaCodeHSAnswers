public class MovieRatings extends ConsoleProgram
{
    public void run()
    {
        double movieRating = readDouble("Please enter a movie rating: ");
        
        // Round the movieRating to the nearest int and print it out!
        
        System.out.println("Rating rounded: " + rounding(movieRating));
    }
    
    private int rounding(double x)
    {
        int y = (int)x;
        if(x - y >= 0.5) y++;
        return y++;
    }
}
