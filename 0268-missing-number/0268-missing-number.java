class Solution {
    public int missingNumber(int[] nums) 
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int number : nums)
        {
            hs.add(number);
        }
        
        for(int i = 0; i <= nums.length; i++)
        {
            if(!hs.contains(i))
            {
                return i;
            }
        }
        return -1;
    }
}