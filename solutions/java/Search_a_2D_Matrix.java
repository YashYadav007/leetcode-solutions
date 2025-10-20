class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length-1;
        int mid=0;
        while(start<=end){
            mid = (start+end)/2;
            if(matrix[mid][0]<target){
                start = mid+1;
            }
            else if(matrix[mid][0]==target){
                return true;
            }
            else{
                end=mid-1;
            }
        }
        int targetRow = start-1;
        if (targetRow < 0) return false;
        start = 0;
        end = matrix[mid].length-1;
        while(start<=end){
            mid = (start+end)/2;
            if(matrix[targetRow][mid]<target){
                start = mid+1;
            }
            else if(matrix[targetRow][mid]==target){
                return true;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}