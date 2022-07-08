import java.util.ArrayList;

public class Odd extends ConsoleProgram
{
    public void run()
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for(int i = 1; i <100; i++) odds.add(i);
        removeEvens(odds);
    }
    
    public static void removeEvens(ArrayList<Integer> array)
    {
        array.removeIf(n->n%2==0);
        for(int i:array) System.out.println(i);
    }
}
