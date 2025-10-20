class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int write = m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[write]=nums1[i];
                write--;
                i--;
            }
            else{
                nums1[write]=nums2[j];
                j--;
                write--;
            }
        }
        while(i>=0){
            nums1[write]=nums1[i];
            write--;
            i--;
        }
        while(j>=0){
            nums1[write]=nums2[j];
            j--;
            write--;
        }
    }
}