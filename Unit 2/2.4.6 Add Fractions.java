public class AddFractions extends ConsoleProgram
{
    public void run()
    {
        int firstNumerator = readInt("What is the numerator of the first fraction? ");
        int firstDenominator = readInt("What is the denominator of the first fraction? ");
        int secondNumerator = readInt("What is the numerator of the second fraction? ");
        int secondDenominator = readInt("What is the denominator of the second fraction? ");
        int calculateNum;
        int calculateDenom;
        int denom;
        
        if(firstDenominator == secondDenominator)
        {
            calculateNum = firstNumerator + secondNumerator;
            calculateDenom = firstDenominator;
        }
        else
        {
            calculateNum = firstNumerator * secondDenominator + secondNumerator * firstDenominator;
            calculateDenom = firstDenominator * secondDenominator;
        }
        
        System.out.println("The sum of " + firstNumerator + "/" + firstDenominator + " + " + secondNumerator + "/" + secondDenominator + " = " + calculateNum + "/" + calculateDenom);
    }
}
