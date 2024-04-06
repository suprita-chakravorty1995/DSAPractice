class Solution {
    public void rotate(int[][] matrix) 
    {

        // Transpose the matrix
        for(int i=0; i < matrix.length; i++)
        {
            for(int j =i; j< matrix[0].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row of the matrix

        int n = matrix[0].length;
        for(int i=0; i < matrix.length; i++)
        {
            for(int j =0; j< matrix[0].length/2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }


        
    }
}
