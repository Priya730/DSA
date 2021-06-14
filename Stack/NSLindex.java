public class Main {
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        largestRectangleAreaNSL(heights);
        
    }
    
    public static void largestRectangleAreaNSL(int[] heights) {
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
        
        for(int l: left){
            System.out.print(l+" ");
        }
        
    }
}
