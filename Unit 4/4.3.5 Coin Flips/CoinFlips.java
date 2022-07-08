public class CoinFlips extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
        int heads = 0, tails = 0;
        for(int i = 0; i < FLIPS; i++)
        {
            if(Randomizer.nextBoolean())
            {
                System.out.println("Heads");
                heads++;
            }
            else
            {
                System.out.println("Tails");
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println("% Heads: " + (double) heads/100);
        System.out.println("% Tails: " + (double) tails/100);
    }
}
