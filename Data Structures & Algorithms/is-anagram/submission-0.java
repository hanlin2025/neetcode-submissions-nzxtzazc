class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<String, Integer> sMap = new HashMap<>();
        HashMap<String, Integer> tMap = new HashMap<>();

        String[] sArray = s.split("");
        String[] tArray = t.split("");

        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(sArray[i])) {
                sMap.put(sArray[i], sMap.get(sArray[i]) + 1);
            } else {
                sMap.put(sArray[i], 1);
            }

            if (tMap.containsKey(tArray[i])) {
                tMap.put(tArray[i], tMap.get(tArray[i]) + 1);
            } else {
                tMap.put(tArray[i], 1);
            }
        }

        boolean isAnagrams = sMap.equals(tMap);

        return isAnagrams;
    }
}
