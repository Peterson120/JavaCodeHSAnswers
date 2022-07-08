public class Pyramid extends ConsoleProgram
{
    public void run()
    {
        Double num = readDouble("Enter the number of blocks used to build the pyramid: ");
        System.out.println("The pyramid weighs " + num*2.5 + " tons");
    }
}
