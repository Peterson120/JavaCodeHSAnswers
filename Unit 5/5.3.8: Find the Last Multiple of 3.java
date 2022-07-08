public int findMultipleOfThree(int[] arr)
{
    int multiple = 0;
    for(int i = arr.length-1; i > 0; i--)
    {
        if(arr[i]%3==0) return i;
    }
    return -1;
}

