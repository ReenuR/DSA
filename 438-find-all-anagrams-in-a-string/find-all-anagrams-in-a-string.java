class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> pCount = new HashMap<>();
        if(p.length() > s.length())
            return result;

        for(char ch : p.toCharArray()){
            pCount.put(ch, pCount.getOrDefault(ch,0)+1);
        }
        
        int matched=0;
        for(int right = 0, left =0; right<s.length(); right++){

            if(right >= p.length()){
                if(pCount.containsKey(s.charAt(left))){
                    if (pCount.get(s.charAt(left)) == 0) matched--;
                    pCount.put(s.charAt(left), pCount.get(s.charAt(left))+1);
                }

                left++;
            }
            if(pCount.containsKey(s.charAt(right))){
                pCount.put(s.charAt(right), pCount.get(s.charAt(right))-1);
                if(pCount.get(s.charAt(right))== 0)
                    matched++;
            }

            if(matched==pCount.size()){
                result.add(left);
            }

        }
        return result;
    }
}
