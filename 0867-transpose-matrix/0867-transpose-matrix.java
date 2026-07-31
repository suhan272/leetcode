class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int l=matrix[0].length;
int ans[][]=new int[l][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<l;j++){
                ans[j][i]=matrix[i][j];
            }
        }return ans;
    }
}