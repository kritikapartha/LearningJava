package learningjava;

public class LongestPalindrome {
	
	public String longestPalindrome(String s) {
	       int max = 1;
	       int start = 0;
	       String end = " ";
	      
	       for (int i=0; i<s.length(); i++){
	           for (int j = i; j<s.length(); j++)
	           
	            {
	                int check = 1;
	                for (int k=0; k<(j-i+1);k++)
	                {
	                    if(s.charAt(i+k) != s.charAt(j-k))
	                        {
	                            check = 0;
	                        }
	                }
	                
	                if(check!=0 && (j-i+1) > max)
	                    {
	                        start = i;
	                        max = j-i+1;
	                    }
	            } 
	        
	            
	          
	    }
	     for (int a = start; a<=start+max-1; a++)
	    {
	        end += s.substring(a, a+1);
	    }
	          return end;
	    }

}
