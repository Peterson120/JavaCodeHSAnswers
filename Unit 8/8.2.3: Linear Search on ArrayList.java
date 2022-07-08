public int search(ArrayList<Double> list, double key)
{
    for(int i = 0; i < list.size(); i++)
    {
        if(list.get(i) == key) return i;
    }
    return -1;
}
