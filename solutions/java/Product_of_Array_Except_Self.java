class Solution {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];

    // Approach:
    // Use two passes:
    // 1) From left to right, accumulate product of all elements to the left of current index.
    // 2) From right to left, accumulate product of all elements to the right of current index,
    //    and multiply with the left product stored in ans.
    //
    // This avoids division and runs in O(n) time with O(1) extra space (excluding output).
    //
    // Key invariants:
    // - ans[i] after first pass holds product of all elements left of i
    // - rightProduct accumulates product of elements right of i during second pass

    ans[0] = 1; // no elements left of first index
    for (int i = 1; i < n; i++) {
      ans[i] = ans[i - 1] * nums[i - 1];
    }

    int rightProduct = 1; // product of elements to the right
    for (int i = n - 1; i >= 0; i--) {
      ans[i] *= rightProduct;
      rightProduct *= nums[i];
    }

    return ans;
  }
}