class Solution {
    public String solution(String myString, String pat) {
        int patLen = pat.length();
        
        for(int i = myString.length() - patLen; 0 <= i; i--) {
            if(myString.substring(i, i + patLen).equals(pat)) {
                return myString.substring(0, i + patLen);
            }
        }
        
        return "";
    }
}