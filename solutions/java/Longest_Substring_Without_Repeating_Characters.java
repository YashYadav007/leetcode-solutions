class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int longest =0;
        int currentStart = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) {
            	if(currentStart<=map.get(s.charAt(i))) {
            		currentStart = map.get(s.charAt(i)) + 1;
            		count =i - currentStart;
            	}
            }
            map.put(s.charAt(i),i);
            count++;
            longest = Math.max(count, longest);
        }
        return longest;
    }
}