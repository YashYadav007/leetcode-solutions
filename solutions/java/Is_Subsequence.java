class Solution {
  /**
   * Checks if s is a subsequence of t.
   * 
   * @param s The subsequence string.
   * @param t The target string.
   * @return true if s is a subsequence of t, false otherwise.
   */
  public boolean isSubsequence(String s, String t) {
    // Edge case: if s is empty, it's always a subsequence
    if (s.length() == 0) {
      return true;
    }
    
    // Edge case: if t is empty but s is not, s can't be a subsequence
    if (t.length() == 0) {
      return false;
    }
    
    int indexS = 0; // Index for iterating over s
    int indexT = 0; // Index for iterating over t
    
    // Iterate over t to find all characters of s in sequence
    while (indexT < t.length()) {
      if (t.charAt(indexT) == s.charAt(indexS)) {
        indexS++; // Move to the next character in s
        if (indexS == s.length()) {
          // All characters of s found in t
          return true;
        }
      }
      indexT++; // Move to the next character in t
    }
    
    // If we reach the end of t without finding all characters of s
    return false;
  }
}
