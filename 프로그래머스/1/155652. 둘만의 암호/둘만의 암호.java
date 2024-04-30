class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        char[] sk = skip.toCharArray();

        for(char c: s.toCharArray()) {
            char temp = c;

            for(int i = 0; i < index; i++) {
                ++temp;
                if(temp > 'z') temp -= 26;
                for(int j = 0; j < sk.length; j++) {
                    if(temp == sk[j]) {
                        --i;
                        break ;
                    }
                }
            }
            answer.append(temp);
        }
        
        return answer.toString();
    }
}