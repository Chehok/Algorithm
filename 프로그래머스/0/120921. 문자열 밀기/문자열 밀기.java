class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) return 0;
        
        for(int i = 1; i < A.length() + 1; i++) {
            String s = A.substring(A.length() - i , A.length()) 
                + A.substring(0, A.length() - i);
            if(s.equals(B)) return i;
        }
        
        return -1;
    }
}