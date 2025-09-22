class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        HashSet<Character> bagOfJewels = new HashSet();
        
        for(int i = 0; i < jewels.length(); i++)
        {
            bagOfJewels.add(jewels.charAt(i));
        }
        int numOfJewels = 0;
        
        for(int i = 0; i < stones.length(); i++)
        {
            if (bagOfJewels.contains(stones.charAt(i)))
            {
                numOfJewels++;
            }
        }
        return numOfJewels;
    }
}