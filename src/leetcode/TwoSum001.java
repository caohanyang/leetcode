package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum001 {

	public static void main(String[] args) {
       Solution001 solution = new Solution001();
       int [] input = new int[] {2,7,11,15};
       int[] result = solution.twoSum(input, 9);
       System.out.println(Arrays.toString(result));
	}

}

class Solution001 {
	   public int[] twoSum(int[] nums, int target) {
		   System.out.println(Arrays.toString(nums));
	       HashMap<Integer, Integer> map = new HashMap<> ();
	       for (int i = 0; i< nums.length; i++) {
              if (map.containsKey(nums[i])) {
            	  return new int[] {map.get(nums[i]), i};
              }
              map.put((target - nums[i]), i);
       
	      }
	       return null;
	  }
}