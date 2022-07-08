import java.util.*;

public class WordCounts extends ConsoleProgram
{
    public void run()
    {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        String user = readLine("Enter a string: ");
        ArrayList<String>array = new ArrayList<String>(Arrays.asList(user.split(" ")));
        arr.replaceAll(n->n.toLowerCase());
        for(String i:array) hash.put(String.valueOf(i),hash.get(i)==null?1:hash.get(i)+1);
        printSortedHashMap(hash);
    }
    
    /*
     * This method takes a HashMap of word counts and prints out
     * each word and it's associated count in alphabetical order.
     *
     * @param wordCount The HashMap mapping words to each word's frequency count
     */
    private void printSortedHashMap(HashMap<String, Integer> wordCount){
        // Sort all the keys (words) in the HashMap
        Object[] keys = wordCount.keySet().toArray();
        Arrays.sort(keys);
        
        // Print out each word and it's associated count
        for (Object word : keys) {
            int val = wordCount.get(word);
            System.out.println(word + ": " + val);
        }
    }
}
