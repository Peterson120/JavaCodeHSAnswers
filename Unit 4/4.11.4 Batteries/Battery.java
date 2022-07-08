public class Battery
{
    private double voltage;
    public static double totalVoltage = 0;
    public static int numOfBatteries = 0;
    
    public Battery(double voltage)
    {
        this.voltage = voltage;
        this.numOfBatteries++;
        this.totalVoltage+=this.voltage;
    }
    
    public double getVoltage()
    {
        return this.voltage;
    }
}
