class Solution {
    public void moveZeroes(int[] nums) 
    {
        int headOfNonZeroList = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[headOfNonZeroList] = nums[i];
                headOfNonZeroList++;
            }
        }
        for(int j = headOfNonZeroList; j < nums.length; j++)
        {
            nums[j] = 0;
        }
    }
}