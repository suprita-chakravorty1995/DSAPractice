class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean found = false;

        int i = 0, j = cols-1;
        while(i >= 0 && i< rows && j >= 0 && j < cols)
        {
            if(matrix[i][j] == target)
            {
                found = true;
                break;
            }
            else if(matrix[i][j] < target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        return found;

    }
}
