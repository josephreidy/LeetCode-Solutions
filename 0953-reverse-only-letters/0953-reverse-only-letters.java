class Solution {
    public String reverseOnlyLetters(String s) 
    {
        int left = 0;
        int right = s.length()-1;
        char[] charArray = s.toCharArray(); 
        while (left < right)
        {
            while(!(Character.isLetter(charArray[left])) && left < right)
            {
                left++;
            }
            while(!Character.isLetter(charArray[right]) && left < right)
            {
                right--;
            }
            char leftChar = charArray[left];
            char rightChar = charArray[right];
            charArray[right] = leftChar;
            charArray[left] = rightChar;
            right--;
            left++;
        }
        StringBuilder returnString = new StringBuilder();
        for(char c : charArray)
        {
            returnString.append(c);
        }
        return returnString.toString();
    }
}