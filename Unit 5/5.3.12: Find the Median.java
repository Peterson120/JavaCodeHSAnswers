public double median(int[] arr)
{
    Arrays.sort(arr);
    return (arr.length%2==1)?arr[arr.length/2]:(arr[arr.length/2-1]+arr[arr.length/2])/2.0;
}

