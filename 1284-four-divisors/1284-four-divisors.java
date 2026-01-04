class Solution {
    
    public int sumFourDivisors(int[] nums) 
    {
        int total = 0;
        for(int num : nums)
        {
            total += addToSum(num);
        }
        return total;
    }



    private int addToSum(int num)
    {
        if(num < 6)
        {
            return 0;
        }
        
        int counter = 2;
        int total = 1 + num;

        if(num%2 == 0)
        {
            total += 2 + (num/2);
            counter += 2;
        }

        for(int n = 3; n < num/2; n++)
        {
            if (num % n == 0)
            {
                counter++;
                total += n;
            }
            if (counter > 4)
            {
                break;
            }
        }
        if (counter == 4)
        {
            return total;
        }
        else return 0;
    }
}