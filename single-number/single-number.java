class Solution {
    public int singleNumber(int[] nums) {
        
        int sigleNumber = 0;
		int check = 0;
		
		for(int i = 0  ; i < nums.length ; i ++ )
        {
            // 배열 내 중복 체크
			for(int j = 0 ; j < nums.length ; j ++) 
            {
				if(nums[j] == nums[i]) 
                {
					check ++;
				}
			}
            
			if(check == 1){
				sigleNumber = nums[i];
			}
			check = 0;
		}
        return sigleNumber;
    }
}