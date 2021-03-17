public class addTwoNumbersList {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    
	    ListNode head = null;
	    ListNode temp = null;
	    int carry = 0; //if sum is greater than 10, sum%10 is stored here
	    
	    while(l1!=null||l2!=null) //runs until end of l1 and l2
	    {
	        int sum = carry;
	        if (l1!=null)
	        {
	            sum+=l1.val; //adds sum to l1 and traverses through l1
	            l1=l1.next;
	        }
	         if (l2!=null)
	        {
	            sum+=l2.val;//adds sum to l2 and traverses through l2
	            l2=l2.next;
	        }
	        
	        ListNode result = new ListNode (sum%10);
	        carry = sum/10;
	        if (temp == null)  
	        {
	            temp = head = result;
	        }
	        else {
	            temp.next = result;
	            temp=temp.next;
	        }
	        
	    }
	    if (carry > 0) {
	            temp.next = new ListNode(carry);
	        }
	        return head;
	        
	    }
}
