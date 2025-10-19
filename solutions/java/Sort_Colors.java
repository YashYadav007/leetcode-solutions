class Solution {
    public void sortColors(int[] nums) {
        int low =0,mid=0;
        int high = nums.length-1;

        while(mid<=high&&mid<nums.length){
            while(mid<=high&&mid<nums.length&&nums[low]==0){
                low++;
                mid++;
            }
            while(mid<=high&&mid<nums.length&&nums[high]==2){
                high--;
            }
            if(mid>high||mid>=nums.length||high<0) return;
            if(nums[low]==2||nums[high]==0){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high]=temp;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high]=temp;
            }
            else if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid]=temp;
            }
            else{
                mid++;
            }
        }
    }
}