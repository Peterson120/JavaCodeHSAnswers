public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    public Dragon(String theName,int theLevel)
    {
        name = theName;
        level = theLevel;
        level();
    }
    // Put getters here
    
    public String getName()
    {
        return name;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public boolean isFireBreather()
    {
        return canBreatheFire;
    }
    
    public void gainExperience()
    {
        level += 10;
        level();
    }
    
    private void level()
    {
        canBreatheFire = false;
        if(level >= 70){
            canBreatheFire = true;
        }
    }
    
    public void attack()
    {
        if(canBreatheFire == true)
        {
            System.out.println(">>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>");
        }
        else
        {
            System.out.println("~ ~ ~");
        }
    }
}
