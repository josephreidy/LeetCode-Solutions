class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int leftPointer = 0;
        int currentNumberOfZeroes = 0;
        int maxLength = 0;
        
        // for loop increments right pointer every iteration
        for(int rightPointer = 0; rightPointer < nums.length; rightPointer++)
        {
            // adjusts current no. of zeroes if we have just added a zero to the window
            if (nums[rightPointer] == 0)
            {
                currentNumberOfZeroes++;
            }
            
            // shrinks window until window doesn't exceed max no. of zeroes. 
            while(currentNumberOfZeroes > k)
            {
                leftPointer++;
                if (nums[leftPointer-1] == 0)
                {
                    currentNumberOfZeroes--;
                }
            }
            maxLength = Math.max(maxLength, (rightPointer - leftPointer) + 1);
        }
        return maxLength;
    }
}