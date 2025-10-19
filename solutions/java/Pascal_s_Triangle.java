class Solution {
    public List<List<Integer>> generate(int numsRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numsRows==1) {
            ans.add(new ArrayList<>());
            ans.get(0).add(1);
            return ans;
        }
    	int[][] matrix = new int[numsRows][numsRows];
        for(int i=0;i<numsRows;i++) Arrays.fill(matrix[i],1);
        for(int i=1;i<numsRows;i++){
            for(int j=1;j<numsRows-i;j++){
                matrix[i][j] = matrix[i-1][j]+matrix[i][j-1];
            }
        }
//        for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[0].length; j++) {
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println();
//		}
        
        int i=0,j=0;
        for(int k=0;k<numsRows;k++) {
        	ans.add(new ArrayList<>());
        	i=k;
        	j=0;
        	while(i>=0&&j<numsRows) {
        		ans.get(k).add(matrix[i][j]);
        		i--;j++;
        	}
        }
        return ans;
    }
}