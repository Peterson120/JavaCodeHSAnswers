public class FractionTester extends ConsoleProgram
{
    public void run()
    {
        Fraction c1 = new Fraction(1,2);
        Fraction c2 = new Fraction(1,2);
        System.out.println(c1.compareTo(c2));
        System.out.println(c1.equals(c2));
    }
}
