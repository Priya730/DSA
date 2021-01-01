/*Given a string s and an integer array indices of the same length.

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.*/

/*Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.*/

/*Input: s = "art", indices = [1,0,2]
Output: "rat"*/



class Solution {
    public String restoreString(String s, int[] indices) {
        char [] shuffled = new char[indices.length];
        for(int i =0; i<indices.length;i++){
            shuffled[indices[i]] = s.charAt(i);
        }
        return new String(shuffled);
    }
}
