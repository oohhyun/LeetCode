class Solution {
    public boolean judgeCircle(String moves) {
        
        // count[1] : U
        // count[2] : D
        // count[3] : L
        // count[4] : R
        int[] count = new int[4]; 
        char[] arr  = new char[moves.length()]; 
        
        for(int i = 0; i < moves.length(); i++) 
        {
           arr[i] = moves.charAt(i);
        }
      
        for(char ch : arr) 
        {
            if(ch == 'U')
            {
                count[0]++;
            }
            else if(ch == 'D')
            {
                count[1]++;
            }
            else if(ch == 'L')
            {
                count[2]++;
            }
            else if(ch == 'R')
            {
                count[3]++;
            }
        }
        
        if((count[0] == count[1]) && (count[2] == count[3])) 
    	{                                           
		    return true;				    	      
        }     
        return false;
    }
}