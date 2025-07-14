// sliding door approach

class Solution 
{
    public int lengthOfLongestSubstring(String s)
    {
        int longestLength = 0;
        HashSet<Character> hs = new HashSet<Character>();
        int left = 0;
        for (int right = 0; right < s.length(); right++)
        {
            char currentChar = s.charAt(right);
            while(hs.contains(currentChar))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(currentChar);
            longestLength = Math.max((right-left)+1, longestLength);
        }
        return longestLength;   
    }
}