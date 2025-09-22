class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine)
    {
        HashMap<Character, Integer> charsInMag = new HashMap();
        //char[] magArray = magazine.toCharArray();
        for(int i = 0; i < magazine.length(); i++)
        {
            char currentChar = magazine.charAt(i);
            charsInMag.put(currentChar, charsInMag.getOrDefault(currentChar, 0)+1);
        }
        
        for(int i = 0; i < ransomNote.length(); i++)
        {
            char currentChar = ransomNote.charAt(i);
            if(!charsInMag.containsKey(currentChar))
            {
                return false;
            }
            else
            {
                charsInMag.put(currentChar, charsInMag.get(currentChar) -1);
                if(charsInMag.get(currentChar) == 0)
                {
                    charsInMag.remove(currentChar);
                }
            }
        }
        return true;
            
    }
}