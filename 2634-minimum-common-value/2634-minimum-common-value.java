class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
        int min = Integer.MAX_VALUE;
        boolean commonNumExists = false;
        HashSet<Integer> hsNums1 = new HashSet();

        for(int num : nums1)
        {
            hsNums1.add(num);
        }

        for(int num : nums2)
        {
            if (hsNums1.contains(num))
            {
                min = Math.min(num, min);
                commonNumExists = true;
            }
        }
        if(commonNumExists)
        {
            return min;
        }
        else return -1;
    }
}