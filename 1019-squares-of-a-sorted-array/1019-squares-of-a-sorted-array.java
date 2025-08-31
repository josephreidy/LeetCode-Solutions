class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int[] returnArray = new int[nums.length];
        
        // index of first nonNegative number
        int nonNegative = 0;
        while(nums[nonNegative] < 0 && nonNegative <= nums.length-2)
        {
            nonNegative++;
        }
        if(nonNegative == nums.length - 2 && nums.length > 3)
        {
            if(nums[nonNegative] <= 1)
            {
                if(nums[nonNegative+1] <= 1)
                {
                    nonNegative +=2;
                }
                else
                {
                    nonNegative++;
                }
            }
        }
        
        // note if no negative numbers, then negative = - 1
        int negative = nonNegative - 1;
        int index = 0;
        System.out.println("" + nonNegative + " " + negative);
        while(negative >= 0 && nonNegative < nums.length)
        {
            if(nums[negative] * nums[negative] > nums[nonNegative] * nums[nonNegative])
            {
                returnArray[index] = nums[nonNegative] * nums[nonNegative];
                index++;
                nonNegative++; 
            }
            else
            {
                returnArray[index] = (nums[negative] * nums[negative]);
                index++;
                negative--;
            }
        }
        
        while(negative >= 0)
        {
            returnArray[index] = nums[negative] * nums[negative];
            index++;
            negative--;
        }
        while(nonNegative < nums.length)
        {
            returnArray[index] = nums[nonNegative] * nums[nonNegative];
            index++;
            nonNegative++;
        }
        return returnArray;
        
        
    }
}