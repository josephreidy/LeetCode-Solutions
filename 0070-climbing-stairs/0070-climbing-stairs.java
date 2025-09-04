class Solution {
    public int climbStairs(int n) 
    {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        return dp(n, memo);
    }

    private int dp(int n, HashMap<Integer, Integer> memo)
    {
        if(n == 0)
        {
            return 0;
        }
        
        if(n == 1)
        {
            return 1;
        }

        if(n==2)
        {
            return 2;
        }

        int returnInt = 0;

        if(!memo.containsKey(n-1))
        {
            int valueForMemo = dp(n-1, memo);
            memo.put(n-1, valueForMemo);
        }
        returnInt += memo.get(n-1);
        
        if(!memo.containsKey(n-2))
        {
            int valueForMemo = dp(n-2, memo);
            memo.put(n-2, valueForMemo);
        }
        returnInt += memo.get(n-2);

        return returnInt;
    }

   
}