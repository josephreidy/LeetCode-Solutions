class Solution {
    public int countPrimes(int n) 
    {
        boolean[] notPrime = new boolean[n+1];

        for(int p = 2; p * p <= n; p++)
        {
            if(!notPrime[p])
            {
                for(int i = p*p; i < notPrime.length; i = i+p)
                {
                    notPrime[i] = true;
                }
            }
        }
        int noOfPrimes = 0;
        for(int i = 2; i < notPrime.length-1; i++)
        {
            // if number is not marked as not prime (e.g. is prime)
            if(!notPrime[i])
            {
                noOfPrimes++;
            }
        }
        return noOfPrimes;
    }
}