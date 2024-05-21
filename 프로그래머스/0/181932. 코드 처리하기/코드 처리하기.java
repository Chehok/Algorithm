class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if(c == '1') {
                mode = mode == 1 ? 0: 1;
            } else {
              if(i % 2 == mode) {
                  ret.append(c);
              } 
            }
        }
        
        return ret.length() > 0 ? ret.toString() : "EMPTY";
    }
}