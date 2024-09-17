class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1 = 0, sum2 = 0;

        for(int i = 0; i < mat.length; i++){
            sum1 += mat[i][i];
        }
        int j = mat[0].length - 1;

        for(int i = 0; i < mat.length; i++,j--){
            if(i != j)
                sum2 += mat[i][j];
        }

        return sum1 + sum2;
    }
}