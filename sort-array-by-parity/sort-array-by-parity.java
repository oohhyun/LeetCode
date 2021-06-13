class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int[] sorytArrat = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        
        for(int item : nums)
        {
            if(item%2 == 0) {   
                sorytArrat[i]=item;
                i++;
            }
            else {   
                sorytArrat[j]=item;
                j--;
            }
        }
        return sorytArrat;
    }
}