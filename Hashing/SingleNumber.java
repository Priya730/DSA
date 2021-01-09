class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i: nums){
            hashmap.put(i,hashmap.getOrDefault(i, 0)+1);
        }
        for(int i: nums){
            if(hashmap.get(i)==1){
               return i; 
            }
            
        }
        return 0;
}
}
