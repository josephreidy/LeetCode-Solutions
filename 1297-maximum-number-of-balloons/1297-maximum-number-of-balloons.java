class Solution {
    public int maxNumberOfBalloons(String text) 
    {
        HashMap<Character, Integer> charToFreq = new HashMap<Character, Integer>();
        
        for(int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if(validLetter(c))
            {
                charToFreq.put(c, charToFreq.getOrDefault(c, 0) + 1);
            }
        }
        
        int ans = 0;
        
        while(containsBalloon(charToFreq))
        {
            ans++;
            charToFreq.put('b', charToFreq.get('b') - 1);
            charToFreq.put('a', charToFreq.get('a') - 1);
            charToFreq.put('l', charToFreq.get('l') - 2);
            charToFreq.put('o', charToFreq.get('o') - 2);
            charToFreq.put('n', charToFreq.get('n') - 1);
        }
        
        return ans;
        
        
    }
    private boolean validLetter(char c)
    {
        return(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n');
    }

    private boolean containsBalloon(HashMap<Character, Integer> hm)
    {
        return (hm.getOrDefault('b', 0) >= 1 && hm.getOrDefault('a',0) >= 1 && hm.getOrDefault('l',0) >= 2 && hm.getOrDefault('o',0) >= 2 && hm.getOrDefault('n',0) >= 1);
    }
    
    
    
}