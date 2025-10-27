class Solution {
    public int maxRepeating(String sequence, String word) 
    {
        int returnValue = 0;
        String currentWord = word;

        for(int i = word.length(); i <= sequence.length(); i += word.length())
        {
            if(sequence.contains(currentWord))
            {
                returnValue++;
                currentWord = currentWord + word;
            }
            else break;
        }
        return returnValue;
    }
}