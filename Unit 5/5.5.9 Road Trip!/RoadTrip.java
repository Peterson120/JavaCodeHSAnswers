import java.util.*;

public class RoadTrip
{
    ArrayList <GeoLocation> locations = new ArrayList<GeoLocation>();
    int stops = 0;
    
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation x = new GeoLocation(name,latitude,longitude);
        locations.add(x);
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return locations.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength()
    {
        double total = 0;
        for(int i = 0; i < locations.size()-1; i++) total += locations.get(i).distanceFrom(locations.get(i+1));
        return total;
    }
    
    // Return a formatted toString of the trip
    public String toString()
    {
        int z = 1;
        String str = "";
        for(GeoLocation i : locations)
        {
            str+=((z++) + ". "+ i);
            str+="\n";
        }
        return str;
    }
}
