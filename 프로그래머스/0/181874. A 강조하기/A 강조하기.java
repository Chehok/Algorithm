class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        myString = myString.toLowerCase();
        
        for(char c: myString.toCharArray()) {
            if(c == 'a') {
                answer.append('A');
            } else {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}