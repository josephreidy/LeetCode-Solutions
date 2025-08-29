class Solution {
    public void reverseString(char[] s) 
    {
            int j = s.length - 1;
            for(int i = 0; i < (s.length / 2); i ++)
            {
                char leftChar = s[i];
                char rightChar = s[j];
                s[i] = rightChar;
                s[j] = leftChar;
                j--;
            }
    }
}