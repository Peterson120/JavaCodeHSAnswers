public int sumRow(int[][] matrix, int row)
{
    int sum = 0;
    for(int i:matrix[row]) sum += i;
    return sum;
}
