class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        HashSet<Character> letters = new HashSet<Character>();
        for(int i = 0; i < sentence.length(); i++)
        {
            letters.add(sentence.charAt(i));
        }
        return letters.size() == 26;
    }
}