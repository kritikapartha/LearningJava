//Given a string s, returns the longest instance of a palindrome within it
package learningjava;

public class LongestPalindrome {
	
	public String longestPalindrome(String s) {
	       int max = 1; //max length
	       int start = 0; //start of the palindrome
	       String end = " ";
	      
	       for (int i=0; i<s.length(); i++){
	           for (int j = i; j<s.length(); j++)
	           
	            {
	                boolean check = true;; //used to check if it is palindrome
	                for (int k=0; k<(j-i+1);k++)
	                {
	                    if(s.charAt(i+k) != s.charAt(j-k)) //
	                        {
	                            check = false;
	                        }
	                }
	                
	                if(check!=false && (j-i+1) > max)
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
