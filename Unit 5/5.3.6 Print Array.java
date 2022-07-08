import java.util.ArrayList;

public class PrintArray extends ConsoleProgram
{
    public void run()
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        printArr(arr);
    }
    
    public void printArr(ArrayList<String> arr)
    {
        // Print everything in the array on its own line
        for(String s : arr)  System.out.println(s);
    }
}
