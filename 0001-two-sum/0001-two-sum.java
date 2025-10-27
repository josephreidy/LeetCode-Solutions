class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i = 0; i < nums.length; i++)
        {
            int currentNum = nums[i];
            int necessarySum = target - currentNum;
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[j] == necessarySum)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1};
    }
}