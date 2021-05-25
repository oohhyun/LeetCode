class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] sum  = new int[nums.length];
		int temp   = 0;
		int i      = 0;
        
		while(i < nums.length) {
			temp  += nums[i];
			sum[i] = temp;
			i++;
		}
        return sum;
    }
}