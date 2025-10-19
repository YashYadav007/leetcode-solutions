class Solution {
    public void nextPermutation(int[] nums) {
        int i,breakingPoint=-1;
        for(i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                breakingPoint=i-1;
                break;
            }
        }
        if(breakingPoint==-1){
            Arrays.sort(nums);
            return;
        }
        for(i=nums.length-1;i>0;i--){
            if(nums[breakingPoint]<nums[i]){
                int temp = nums[breakingPoint];
                nums[breakingPoint]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        Arrays.sort(nums,breakingPoint+1,nums.length);
    }
}