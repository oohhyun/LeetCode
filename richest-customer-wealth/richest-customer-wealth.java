class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int[] acccount_counts =  new int[accounts.length];
		int max = 0;
        
		for( int i = 0 ; i < accounts.length ; i++ ) 
        {
			for(int j = 0 ; j < accounts[i].length ; j++ ) 
            {
				acccount_counts[i] += accounts[i][j];
			}
			max = Math.max(max , acccount_counts[i]);
		}
        return max;
    }
}