class Solution {
    public int countElements(int[] arr) 
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        int counter = 0;
       
        for (int element: arr)
        {
            hs.add(element);
        }
        
        for (int element : arr)
        {
            if (hs.contains(element+1))
            {
                counter++;
            }
        }
        return counter;
    }
}