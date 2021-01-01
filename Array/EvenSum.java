//Q: Find the min number to be added to the sum of the array to make sum even.
// Method 1: traverse array return rem 
package dsa;

public class EvenSum {

	static int minNumber(int arr[], int n) {
		boolean odd = false;
		for(int i=0;i<n;i++) {
			if(arr[i]%2 !=0)
				odd = !odd;}
			
		if(odd) 
			return 1;
		return 2;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.print("The min number to be added to make sum even is: "+ minNumber(arr, arr.length));

	}

}
