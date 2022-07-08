public class LongestStreak extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
        int heads = 0,tails = 0,longest = 0;
        for(int i = 0; i < FLIPS; i++)
        {
            if(Randomizer.nextBoolean())
            {
                System.out.println("Heads");
                heads++;
                longest = heads>longest?heads:longest;
            }
            else
            {
                System.out.println("Tails");
                heads = 0;
            }
        }
        System.out.println("Longest streak of heads: " + longest);
    }
}
