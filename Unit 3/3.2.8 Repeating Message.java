public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        printMessage("hi", "hi", 8);
    }
    
    public void printMessage(String lineOne, String lineTwo, int numLines)
    {
        String[] list = {lineOne,lineTwo};
        for(int i = 0; i < numLines; i++) System.out.println(list[i%2]);
    }
}
