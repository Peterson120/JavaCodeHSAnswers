public class City implements Summable
{
    private int population;
    private String name;

    public City(String name, int population)
    {
        this.name = name;
        this.population = population;
    }
    
    public int getValue() {return population;}
    
    public int add(Summable other) {return getValue() + other.getValue();}
    
    public String getName() {return name;}
}
