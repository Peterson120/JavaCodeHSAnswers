public class isCharTester extends ConsoleProgram
{
    public void run()
    {
        // Start here!
        String word = "This is a sentence";
        String key = "a";
        System.out.println("The character "+ key+ " is in the String "+ word + ": " + isChar(word, key));
    }
    
    public static boolean isChar(String string, String key)
    {
        if(string.indexOf(key) != -1) return true;
        return false;
    }
}
