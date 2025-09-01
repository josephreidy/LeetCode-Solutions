class Solution 
{
    public int minStartValue(int[] nums) 
    {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        int minValue = prefixSum[0];
        for (int i = 1; i < nums.length; i++)
        {
            prefixSum[i] = prefixSum[i-1] + nums[i];
            if (prefixSum[i] < minValue)
            {
                minValue = prefixSum[i];
            }
        }
        if (minValue > 0)
        {
            return 1;
        }
        else return (minValue * -1) +1;
    }
}