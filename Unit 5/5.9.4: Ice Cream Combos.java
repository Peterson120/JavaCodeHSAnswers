public ArrayList<String> getAllChoices(String[] flavors, String[] toppings)
{
    ArrayList<String> types = new ArrayList<String>();
    for(int i = 0; i < flavors.length; i++)
    {
        for(int z = 0; z < toppings.length; z++)
        {
            types.add(flavors[i] + " with " + toppings[z] + " on top");
        }
    }
    return types;
}
