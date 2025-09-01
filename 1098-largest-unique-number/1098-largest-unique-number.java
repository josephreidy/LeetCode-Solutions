class Solution {
    public int largestUniqueNumber(int[] nums) 
    {
        int max = -1;
        
        // create a hash map that maps each number in nums to its frequency
        HashMap<Integer, Integer> numToFreq = new HashMap<Integer, Integer>();
        for (int num : nums)
        {
            numToFreq.put(num, numToFreq.getOrDefault(num, 0)+1);
        }
        
        for(int num : numToFreq.keySet())
        {
            if(numToFreq.get(num) == 1 && num > max)
            {
                max = num;
            }
        }
        
        return max;
    }
}