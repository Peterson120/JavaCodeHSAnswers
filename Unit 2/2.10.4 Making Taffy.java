public class Taffy extends ConsoleProgram
{
    public void run()
    {
        System.out.println("Starting Taffy Timer...");
        // Start here!
        while(true)
        {
            int user = readInt("Enter the temperature: \n");
            System.out.println(user<270?"The mixture isn't ready yet.":"Your taffy is ready for the next step!");
            if(user >= 270) break;
        }
    }
}
