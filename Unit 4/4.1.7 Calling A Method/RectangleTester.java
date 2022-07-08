public class RectangleTester extends ConsoleProgram
{
    public void run()
    {
        // Create a rectangle with width 7 and height 14
        Rectangle rect = new Rectangle(7,14);
        // Print out the height
        System.out.println(rect.getHeight());
        // Print out the width
        System.out.println(rect.getWidth());
        // Print out the area by calling the getArea method
        System.out.println(rect.getArea());
    }
}
