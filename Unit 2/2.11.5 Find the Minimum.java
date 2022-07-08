public class FindMinimum extends ConsoleProgram
{
    public void run()
    {
        int[] list = new int[3];
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++)
        {
            list[i] = readInt("Enter number: ");
            smallest = (list[i] < smallest) ? list[i]:smallest;
        }
        System.out.println(smallest);
    }
}
