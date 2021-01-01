import java.util.Scanner;

public class EasySumSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int [N];
        for(int i=0;i<N;i++){
          A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int C[] = new int[M];
        for(int i = 0;i<M;i++){
          C[i] = sc.nextInt();
        }

        int B[] = new int[101];
        for(int i=0;i<N;i++){
          for(int j=0;j<M;j++){
            int num = C[j]-A[i];
            if(num>0){
              B[num]++;
            }
          }
        }
        for(int i=1;i<B.length;i++){
          if(B[i]==N){
          System.out.print(i+" ");
          }
        }
	}

}
