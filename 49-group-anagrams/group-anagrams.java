class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char [] chArray = strs[i].toCharArray();

            Arrays.sort(chArray);

            String sortedStr = new String(chArray);

            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
}