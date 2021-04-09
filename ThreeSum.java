//Finds all unique triplets in the array calculated to a sum of 0
//Brute force method
package learningjava;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
	      List<List<Integer>> list = new ArrayList<List<Integer>>(); 
	        for (int i=0; i<nums.length;i++){
	            for (int n=i; i<nums.length;n++)
	            {
	                for(int k=n; k<nums.length; k++)
	                {
	                    if (i != k && k != n && i != n && (nums[i] + nums[n] + nums[k]) == 0) //checks duplicates and sum of 0
	                    {
	                        List<Integer> part = new ArrayList<Integer>(3);
	                        part.add(nums[i]);
	                        part.add(nums[k]);
	                        part.add(nums[n]);
	                        list.add(part);
	                    }
	                }
	            }
	        }
	        
	        return list;
	    }
}
