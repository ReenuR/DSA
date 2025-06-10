class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        //check whther its anagram or not??
        // if yes store its left pointer's value;
        int matched = 0;

        List<Integer> indices = new ArrayList<>();
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char ch : p.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
        }
        for(int left = 0, right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            if(freqMap.containsKey(ch)){
                freqMap.put(ch, freqMap.getOrDefault(ch, 0)-1);
                if(freqMap.get(ch) == 0)
                    matched++;
            } 
            if(matched == freqMap.size()){
                indices.add(left);
            }

            if(right >= p.length()-1){
                char chAtLeft = s.charAt(left++);
                if(freqMap.containsKey(chAtLeft)){
                    if(freqMap.get(chAtLeft) == 0)
                        matched--;
                    freqMap.put(chAtLeft, freqMap.get(chAtLeft)+1);
                    
                }
            }
        }
        return indices;

    }
}