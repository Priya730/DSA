//optimised using 2 pointer

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        
        int left = 0, right = n-1;
        
        int result[] = new int[n];
        
       for(int i=n-1; i>=0; i--){
            if(Math.abs(nums[left])>nums[right]){
                result[i] = nums[left]*nums[left];
                left++;
            }
           
           else{
               result[i] = nums[right]*nums[right];
               right--;
           }
        }
        
        return result;
    }
}
