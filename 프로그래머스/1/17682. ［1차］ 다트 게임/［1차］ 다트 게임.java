import java.util.ArrayList;

class Solution {
    public int solution(String dartResult) {
        String[][] result = new String[3][2];
        int[] scoreBoard = new int[3];
        int sum = 0;
        
        int idx = 0;
        String temp = "";
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if(0 <= c - '0' && c - '0' <= 9) {
                temp += c;
            } else if(0 <= c - 'A' && c - 'A' <= 26) {
                temp += c;
                result[idx++][0] = temp;
                temp = "";
            } else if(c == '*' || c == '#') {
                result[idx - 1][1] = String.valueOf(c);
            } 
        }
        
        for(int i = 0; i < 3; i++) {
            int score = Integer.valueOf(result[i][0].substring(0, result[i][0].length() -1));
            char c = result[i][0].charAt(result[i][0].length() - 1);
            
            if(c == 'S') {
                scoreBoard[i] = getSquare(score, 1);
            } else if(c == 'D') {
                scoreBoard[i] = getSquare(score, 2);
            } else if(c == 'T') {
                scoreBoard[i] = getSquare(score, 3);
            }
            
            String s = result[i][1];
            
            if(s == null) {
                continue;
            } else if(s.equals("*")) {
                if (i > 0) {
                    scoreBoard[i - 1] *= 2;
                }
                scoreBoard[i] *= 2;
            } else if(s.equals("#")) {
                scoreBoard[i] *= -1;
            }
        }
        
        for(int score: scoreBoard) {
            sum += score;
        }
        
        return sum;
    }
    
    private int getSquare(int num, int square) {
        int result = 1;
        
        for(int i = 0; i < square; i++) {
            result *= num;
        }
        
        return result;
    }
}