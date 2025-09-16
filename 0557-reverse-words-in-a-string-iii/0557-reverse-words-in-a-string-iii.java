class Solution {
    public String reverseWords(String s) 
    {
        char[] charArray = s.toCharArray();
        int p = 0;
        int q = 0;

        while(q < charArray.length-1)
        {
            if(charArray[q+1] == ' ' || q == charArray.length-2)
            {
                if(q == charArray.length-2)
                {
                    q++;
                }
                //System.out.println("executed this part");
                //System.out.println("q = " + charArray[q]);
                //System.out.println("p = " + charArray[p]);
                int right = q;
                int left = p;
                while(left < right)
                {
                    char leftChar = charArray[left];
                    char rightChar = charArray[right];
                    charArray[left] = rightChar;
                    charArray[right] = leftChar;
                    left++;
                    right--;
                }
                q++;
                p = q+1;
            }
            q++;
        }
        return new String(charArray);

    }
}