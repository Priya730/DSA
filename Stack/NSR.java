import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 4};
		nearestSmallertoRight(arr);
	}
	public static void nearestSmallertoRight(int[] arr){
	    Stack<Integer> s = new Stack<>();
	    int res[] = new int[arr.length];
	    Arrays.fill(res, -1);
	    for(int i=arr.length-1; i>=0; i--){
	        while(!s.empty()){
	            if(s.peek() >= arr[i]) s.pop();
	            else{
	                res[i] = s.peek();
	                break;
	            }
	        }
	        
	        s.push(arr[i]);
	    }
	    
	    for(int num: res){
	        System.out.print(num + " ");
	    }
	}
}
