public class ThreeStrings extends ConsoleProgram
{
    public void run()
    {
        // Ask the user for three strings.
        // remember to use the readLine() method.
        String list[] = new String[3];

        for(int i = 0; i < 3; i++) list[i] = readLine("String: ");
        
        System.out.println((list[0] + list[1]).equals(list[2])?list[0] + " + " + list[1] + " is equal to " + list[2] + "!":list[0] + " + " + list[1] + " is not equal to " + list[2] + "!");
    }
}
