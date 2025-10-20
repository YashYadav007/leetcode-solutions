class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<intervals.length;i++) {
        	int start = intervals[i][0];
        	int end = intervals[i][1];
        	while(i+1<intervals.length && intervals[i+1][0]<=end) {
        		i++;
        		end = Math.max(end,intervals[i][1]);
        	}
        	ArrayList<Integer> pair = new ArrayList<>();
        	pair.add(start);
        	pair.add(end);
        	ans.add(pair);
        }
        int[][] matrix = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++) {
        	matrix[i][0]=ans.get(i).get(0);
        	matrix[i][1] = ans.get(i).get(1);
        }
        return matrix;
    }
}