import java.util.*;

public class ExpandingArray
{
    private static final int STARTING_SIZE = 10;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    private int currentSize;
    
    public ExpandingArray()
    {
        currentSize = STARTING_SIZE;
    }
    
    // Remove the element at index `index` and shift
    // all subsequent elements to the left. 
    public void remove(int index)
    {
        arr.remove(index);
    }
    
    // Add the int `element` at the `index` in the array.
    // You'll need to shift everything one index to the right
    // after this index.
    public void add(int index, int element)
    {
        arr.add(index,element); 
    }
    
    // Return the number of elements in your array.
    public int size()
    {
        return arr.size();
    }
    
    public int get(int index)
    {
        return arr.get(index);
    }
    
    public void add(int x)
    {
        arr.add(x);
    }
    
    public String toString()
    {
        // Return empty curly braces if the array is empty
        if (arr.size() == 0)
        {
            return "{}";
        }
        
        // Return Elements 
        String str = "{";
        for (int i=0; i < arr.size(); i++)
        {
            str += arr.get(i) + ", ";
        }
        if (str.length() > 0 && str.charAt(str.length()-2)==',')
        {
            str = str.substring(0, str.length()-2);
            str += "}";
        }
        return str;
    }
}
