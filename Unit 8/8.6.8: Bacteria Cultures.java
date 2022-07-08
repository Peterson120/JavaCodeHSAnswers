public int numBacteriaAlive(int hour)
{
    if(hour == 0) return 10;
    return 3 * numBacteriaAlive(hour-1);
}
