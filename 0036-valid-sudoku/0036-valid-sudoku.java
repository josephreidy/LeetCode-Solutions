import java.util.*;

class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        return (everyBoxValid(board) && everyRowValid(board) && everyColumnValid(board));
    }
    private boolean everyBoxValid(char[][] board)
    {
        for (int i = 0; i < 7; i = i + 3)
        {
            for (int j = 0; j < 7; j = j + 3)
            {
                HashSet<Character> boxSet = new HashSet<>();
                for (int rowOffset = 0; rowOffset < 3; rowOffset++)
                {
                    for(int columnOffset = 0; columnOffset < 3; columnOffset++)
                    {
                        char currentSquare = board[i+rowOffset][j+columnOffset];
                        if (currentSquare == '.') {}
                        else if (boxSet.contains(currentSquare))
                        {
                            return false;
                        }
                        else boxSet.add(currentSquare);
                    }
                }
            }
        }
        return true;
    }

    private boolean everyColumnValid(char[][] board)
    {
        for (int column = 0; column < 9; column++)
        {
            HashSet<Character> columnSet = new HashSet<>();
            for (int row = 0; row < 9; row++)
            {
                if(board[row][column] == '.') {}
                else if (columnSet.contains(board[row][column]))
                {
                    return false;
                }
                else columnSet.add(board[row][column]);
            }
        }
        return true;
    }

    private boolean everyRowValid(char[][] board)
    {
        for (int row = 0; row < 9; row++)
        {
            HashSet<Character> rowSet = new HashSet<>();
            for (int column = 0; column < 9; column++)
            {
                if(board[row][column] == '.') {}
                else if (rowSet.contains(board[row][column]))
                {
                    return false;
                }
                else rowSet.add(board[row][column]);
            }
        }
        return true;
    }
}