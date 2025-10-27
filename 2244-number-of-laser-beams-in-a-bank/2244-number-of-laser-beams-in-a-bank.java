class Solution {
    public int numberOfBeams(String[] bank) 
    {
        int totalLasers = 0;
        int prevRow = 0;
        
        for(int i = 0; i < bank.length; i++)
        {
            int thisRow = 0;
            for(int j = 0; j < bank[i].length(); j++)
            {
                if(bank[i].charAt(j) == '1')
                {
                    thisRow++;
                }
            }
            if(thisRow > 0)
            {
                totalLasers += (prevRow * thisRow);
                prevRow = thisRow;
            }
        }
        return totalLasers;

    }

    
}