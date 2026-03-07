class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int low = 0;
         int rows = matrix.length;
         int cols = matrix[0].length;
         int high = (rows)*(cols);
         
         while(low < high){
            int mid = (low + high)/2;
            int row = mid / cols;
            int col = mid % cols;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                high = mid;
            }
            else{
                low = mid+1;
            }
         }
        return false;
    }
}

