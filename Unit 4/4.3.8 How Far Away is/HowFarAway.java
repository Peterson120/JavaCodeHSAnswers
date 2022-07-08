public class HowFarAway extends ConsoleProgram
{
    public void run()
    {
        GeoLocation a = new GeoLocation(readDouble("Enter the latitude of the starting location: "),readDouble("Enter the longitude of the starting location: "));
        GeoLocation b = new GeoLocation(readDouble("Enter the latitude of the ending location: "),readDouble("Enter the longitude of the ending location: "));
        System.out.println("The distance is " + a.distanceFrom(b) + " miles.");
    }
}
