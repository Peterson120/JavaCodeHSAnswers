public class Poetry extends ConsoleProgram
{
    public void run()
    {
        String[] arr = {"A world of dew,", "And within every dewdrop", "A world of struggle.", "Home","Open and inviting","Universal","Safe and warm", "Everything"};
        for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
        
        String user = readLine("Enter your poem: ");
        System.out.println(user);
    }
}
