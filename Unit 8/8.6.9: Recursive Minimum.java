public int findMinimum(int[] numbers, int length)
{
    if(length == 1) return numbers[length-1];
    return Math.min(numbers[length-1],findMinimum(numbers,length-1));
}
