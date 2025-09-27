class Solution {
    public double largestTriangleArea(int[][] points) 
    {
        double maxArea = 0;
        //brute force
        for(int a = 0; a < points.length; a++)
        {
            for(int b= 0; b < points.length; b++)
            {
                for(int c = 0; c < points.length; c++)
                {
                    double area = Math.abs(points[a][0] * (points[b][1] - points[c][1])
                    + points[b][0] * (points[c][1] - points[a][1])
                    + points[c][0] * (points[a][1] - points[b][1])) / 2.0;
                    
                    if(area > maxArea)
                    {
                        maxArea = area;
                    }
                }
            }
        }
        return maxArea;

    }
}