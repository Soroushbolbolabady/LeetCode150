package arrayString;
import java.util.*;

public class MajorityElement {

	
	public int Solution(int[] nums) {
		
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
