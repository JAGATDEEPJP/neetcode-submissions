class Solution {
    public boolean isAnagram(String s, String t) {
               if(s.length() != t.length()) 
            return false;

        Map<Character, Integer> anagramMap = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            anagramMap.put(s.charAt(i), anagramMap.getOrDefault(s.charAt(i), 0) + 1);
            anagramMap.put(t.charAt(i), anagramMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(Integer count: anagramMap.values()) {
            if(count != 0) {
                return false;
            }
        }

        return true;
    }
}
