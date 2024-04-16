class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];

        for(int i=0; i<9; i++)
        {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();
        }

        for(int i =0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                char cell = board[i][j];

                if(cell == '.')
                {
                    continue;
                }
                int gridNo = (i/3) * 3 + j/3;
                boolean isPresentInRow = rowSet[i].contains(cell);
                boolean isPresentInCol = colSet[j].contains(cell);
                boolean isPresentInGrid = gridSet[gridNo].contains(cell);

                if(isPresentInRow || isPresentInCol || isPresentInGrid)
                {
                    return false;
                }

                rowSet[i].add(cell);
                colSet[j].add(cell);
                gridSet[gridNo].add(cell);

            }
        }

        return true;
        
        
    }
}
