class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int summedWindow = 0;
        for(int i = 0; i < k; i++)
        {
            summedWindow += nums[i];
        }
        
        int maxSum = summedWindow;
        System.out.println(""+ summedWindow);
        
        for(int j = 0; j < nums.length - k; j++)
        {
            summedWindow -= nums[j];
            summedWindow += nums[(j+k)];
            System.out.println(""+ summedWindow);
            
            maxSum = Math.max(maxSum, summedWindow);
        }
        return maxSum / (double)k;
        
    }
}