public class CircleTester extends ConsoleProgram
{
    public void run()
    {
        Circle one = new Circle(10, "blue", 50, 40);
        Circle two = new Circle(10, "blue", 50, 40);
        Circle three = new Circle(20, "red", 0, 0);
        Circle four = three;
        
        if(one.equals(two))
        {
            System.out.println("Circles one and two are equal!");
            System.out.println(one);
            System.out.println(two);
        }
        
        if(three.equals(four))
        {
            System.out.println("Circles three and four are equal!");
            System.out.println(three);
            System.out.println(four);
        }
    }
}
