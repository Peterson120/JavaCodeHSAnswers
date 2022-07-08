public class UnitCircle extends ConsoleProgram
{
    public void run()
    {
        double value = Math.round(Math.PI * 100) / 100.0;
        System.out.println("Radians: (cos, sin)");
        for(double i = 0; i < 2*value; i+=(value/4)) 
            System.out.println(i + ": " + Math.cos(i) + ", " + Math.sin(i));
    }
}
