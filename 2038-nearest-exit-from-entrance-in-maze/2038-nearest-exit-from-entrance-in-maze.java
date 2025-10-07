class State
{
    int row;
    int col;
    int steps;
    State (int row, int col, int steps)
    {
        this.row = row;
        this.col = col;
        this.steps = steps;
    }
}

class Solution 
{
    int m;
    int n;
    int[][] directions = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};
    public int nearestExit(char[][] maze, int[] entrance) 
    {
        m = maze.length;
        n = maze[0].length;
        Queue<State> queue = new LinkedList<>();
        boolean[][] seen = new boolean[m][n];

        queue.add(new State(entrance[0], entrance[1], 0));
        seen[entrance[0]][entrance[1]] = true;

        while(!queue.isEmpty())
        {
            State node = queue.remove();
            int row = node.row, col = node.col, steps = node.steps;
            if(exit(row, col, maze, entrance))
            {
                return steps;
            }
            
            for(int[] direction : directions)
            {
                int nextRow = row + direction[0], nextCol = col + direction[1];
                if(valid(nextRow, nextCol, maze) && seen[nextRow][nextCol] != true)
                {   
                    seen[nextRow][nextCol] = true;
                    queue.add(new State(nextRow,nextCol, steps+1));
                }
            }
        }
        return -1;
    }

    private boolean valid(int row, int column, char[][] grid)
    {
        return 0 <= row && row < m && 0 <= column && column < n && grid[row][column] == '.';
    }

    private boolean exit (int row, int column, char[][] grid, int[] entrance)
    {
        if(entrance[0] == row && entrance[1] == column)
        {
            return false;
        }
        else if(row == 0 || row == m-1 || column == 0 || column == n-1)
        {
            return true;
        }
        else return false;
    }
}