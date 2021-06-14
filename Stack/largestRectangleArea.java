class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left;
        left = NSLeft(heights);
        int[] right;
        right = NSRight(heights);
        int[] ar = new int[heights.length];
        int max = 0;
        for(int i=0; i<heights.length; i++){
            ar[i] = heights[i] * (right[i]-left[i]-1); 
            max = Math.max(max, ar[i]);
        }
        
        return max;
    }
    
    public static int[] NSRight(int[] heights) {
        int n = heights.length;
        int right[] = new int[n];
        Stack<Integer> s = new Stack<>();
        right[0] = n+1;
        s.push(n-1);
        for(int i=n-1; i>=0; i--){
            while(!s.empty() && (heights[s.peek()] >= heights[i])){
                //System.out.print(heights[s.peek()]);
                s.pop();
                }
            right[i] = (s.empty()) ? (n) : (s.peek());
        
            s.push(i);
        }
        
        return right;
    }
    
    public static int[] NSLeft(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        //Arrays.fill(left, -1);
        Stack<Integer> s = new Stack<>();
        left[0] = -1;
        s.push(0);
        for(int i=1; i<n; i++){
            while(!s.empty() && (heights[s.peek()] >= heights[i])){
                //System.out.print(heights[s.peek()]);
                s.pop();
                }
            left[i] = (s.empty()) ? (-1) : (s.peek());
        
            s.push(i);
        }
        
        return left;
        
    }
}
