class Solution {
    public int binaryGap(int n) {
        
        String binary = Integer.toBinaryString(n);
		int distance = 0 , longestDistanc = 0;
		
		for(int i = 0 ; i < binary.length() ; i ++ )
		{
			if(binary.charAt(i) == '1')
			{
				if(distance > longestDistanc)
				{
					longestDistanc = distance;
				}
				distance = 0;
			}
			distance ++;
		}
        return longestDistanc;
    }
}