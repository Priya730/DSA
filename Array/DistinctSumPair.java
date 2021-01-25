//JAN'21 COOKOFF
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int t = sc.nextInt();
	        while(t>0){
	            t--;
	            
	            int L = sc.nextInt();
	            int R = sc.nextInt();
	            
	            System.out.println(2*R-2*L+1);
	        }
	        
	    }catch(Exception e){
	        return;
	    }
	}
}
