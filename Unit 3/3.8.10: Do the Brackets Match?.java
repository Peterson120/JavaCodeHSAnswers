public boolean bracketsMatch(String brackets)
{
    int count = 0;
    for(int i = 0; i < brackets.length(); i++)
    {
        if(brackets.charAt(i)=='{') count++;
        else
        {
            if(count > 0) count--;
            else return false;
        }
    }
    return count == 0;
}
