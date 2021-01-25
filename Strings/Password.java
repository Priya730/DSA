//JAN'21 COOKOFF

package codechef;

import java.util.Scanner;

public class pwd {

	public static void main(String[] args) {
		 try{
		        
		        Scanner sc = new Scanner(System.in);
		        
		        int t = sc.nextInt();
		        sc.nextLine();
		        while(t>0){
		            t--;
		            
		            String s = sc.nextLine();
		            
		            int n = s.length();
		            //System.out.println(n);
		            boolean Up=false, Low=false, Ch=false, Num=false;
		            String ans ="NO";
		            s.toCharArray();
		            
		            if(n>=10){
		            	for (int i=0; i<n; i++) {
		            	if(Character.isLowerCase(s.charAt(i))) Up=true;
		            	}
		                for (int i=1; i<n-1; i++){
		                    
		                    if(Character.isUpperCase(s.charAt(i))) Low=true;
		                    if(Character.isDigit(s.charAt(i))) Num=true;
		                    if(s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)=='%'||s.charAt(i)=='&'||s.charAt(i)=='?') Ch=true;
		                    
		                } 
		                
		                if(Up&& Low&& Num && Ch) ans="YES"; 
		                
		            }
		            System.out.println(ans);
		        }
		        
		        
		    }catch(Exception e){
		        return;
		    }

	}

}
