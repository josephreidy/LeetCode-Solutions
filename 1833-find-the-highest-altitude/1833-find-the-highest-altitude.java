class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int maximumAltitude = Math.max(gain[0], 0);
        // a prefix sum classic.
        for(int i = 1; i < gain.length; i++)
        {
            gain[i] = gain[i] + gain[i-1];
            int currentAltitude = gain[i];
            maximumAltitude = Math.max(maximumAltitude, currentAltitude);
        }
        return maximumAltitude;
    }
}