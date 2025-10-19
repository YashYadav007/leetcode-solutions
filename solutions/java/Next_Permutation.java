class Solution {
    public void nextPermutation(int[] nums) {
        int i,j=0;
        boolean flag=false;
        for(i=nums.length-1;i>=0;i--){
            for(j=i-1;j>=0;j--){
                if(nums[i]>nums[j]) {
                    flag=true;
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    break;
                }
            }
            if(flag) break;
        }
        if(flag)Arrays.sort(nums,j+1,nums.length);
        else Arrays.sort(nums);
    }
}