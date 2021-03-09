//Returns the indices of two numbers in an array that add up to the target value
package learningjava;

public class TwoSum {
	public static void main(String [] args) {
		
		int[]arr=new int[4];
		arr[0]=2;
		arr[1]=7;
		arr[2]=11;
		arr[3]=15;
		
		twoSum(arr,9);
		
		
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        int [] result = new int[2];
	        for (int i=0; i<nums.length;i++){
	            for(int k=0; k<nums.length;k++)
	                {
	                    if (nums[i]+nums[k] == target && i!=k)
	                    {
	                        result[0] = k;
	                        result[1] = i;
	                    }
	                
	                }
	        }
	        
	        return result;
	    }
	}
