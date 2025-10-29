class Solution {
    public int smallestNumber(int n) 
    {
        String binString = Integer.toBinaryString(n);
        int returnVal = (int) Math.pow(2, binString.length());
        return returnVal -1;
    }
}