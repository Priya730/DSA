public class SelectionSort {
	
	public static void SelectionSort(int[] A) {
		int i, j, min, temp;
		for(i=0; i<A.length-1; i++) {
			min = i;
			for(j=i+1; j<A.length; j++) {
				if(A[j]<A[min]) {
					min = j;
				}
			}
			//swap
			temp = A[min];
			A[min] = A[i];
			A[i] = temp;
		}
		for(int k=0; k<A.length; k++) {
			System.out.print(A[k]+" ");	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {10, 4, 44, 5}; 
		SelectionSort(A);
	}

}
