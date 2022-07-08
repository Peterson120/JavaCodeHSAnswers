public class PrintOdd extends ConsoleProgram
{
    public void run()
    {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
    }
    
    public void printOddIndices(int[] arr)
    {
        // Start here!
        for(int i = 1; i < arr.length+1/2; i+=2) System.out.println(arr[i]);
    }
}
