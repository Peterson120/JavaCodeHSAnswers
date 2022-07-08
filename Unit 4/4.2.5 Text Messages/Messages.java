public class Messages extends ConsoleProgram
{
    public void run()
    {
        TextMessage bart = new TextMessage("Bart","Lisa","Where are you?");
        TextMessage lisa = new TextMessage("Lisa","Bart","I'm at school!");
        // Your code here.
        // Create the two TextMessage objects and print them out.
        System.out.println(bart);
        System.out.println(lisa);
    }
}
