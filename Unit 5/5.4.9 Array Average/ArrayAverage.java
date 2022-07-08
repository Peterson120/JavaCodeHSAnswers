public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
    {
        double total = 0;
        for(double i:values) total += i;
        return (double)total/values.length;
    }
}
