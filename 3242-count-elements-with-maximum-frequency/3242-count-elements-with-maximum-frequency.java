class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        HashMap<Integer, Integer> freq = new HashMap();
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int maxFreq = 0;
        int numsWithMaxFreq = 1;

        for(int key : freq.keySet())
        {
            if(freq.get(key) > maxFreq)
            {
                maxFreq = freq.get(key);
                numsWithMaxFreq = 1;
            }
            else if (freq.get(key) == maxFreq)
            {
                numsWithMaxFreq++;
            }
        }
        return maxFreq * numsWithMaxFreq;
    
    }
}