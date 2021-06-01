class Solution {
    public void reverseString(char[] s) {
        
		char[] ch = new char[s.length];
		
		for(int j = 0 , i = s.length - 1 ; i  >= 0 ; i-- , j++) {
			ch[j] = s[i];
		}
        
        for(int i = 0 ; i < s.length ; i++ ) {
            s[i] = ch[i];
        }
    }
}