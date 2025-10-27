class Solution
{
    private final int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    
    public int numIslands(char[][] grid) 
    {
        int islands = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == '1')
                {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int i, int j)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
        {
            return;
        }
        else
        {
            grid[i][j] = '0';
            for(int[] direction : directions)
            {
                dfs(grid, i + direction[0], j + direction[1]);
            }
        }
    }
}