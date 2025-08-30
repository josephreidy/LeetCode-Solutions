class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        String newString = "";
        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                newString += s.charAt(i);
            }
        }

        int j = newString.length() - 1;
        boolean result = true;
        for(int i = 0; i < newString.length() / 2; i++)
        {
            if(newString.charAt(i) != newString.charAt(j))
            {
                result = false;
            }
            j--;
        }
    return result;
    }
}