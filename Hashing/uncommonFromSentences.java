//https://leetcode.com/problems/uncommon-words-from-two-sentences/submissions/
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> mp = new HashMap<>();
      
        for(String word : s1.split(" ")){
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }
        
        for(String word : s2.split(" ")){
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }
        
       List<String> ans = new LinkedList();
        for(String word : mp.keySet()){
            if(mp.get(word)==1)
                ans.add(word);
        }
        
        return ans.toArray(new String[ans.size()]);
    }
}
