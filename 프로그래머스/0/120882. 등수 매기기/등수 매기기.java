import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Integer[] temp = new Integer[score.length]; // 임시보관
        
        // score -> idx 0 에 합산값 / idx 1 에 index 번호
        // temp -> 합산값을 같이 넣음
        for(int i = 0; i < score.length; i++) {
            score[i][0] = score[i][0] + score[i][1];
            temp[i] = score[i][0];
            score[i][1] = i + 1;
        }
        // 점수 내림차순 정렬
        Arrays.sort(score, (o1, o2) -> o2[0] - o1[0]);
        Arrays.sort(temp, (o1, o2) -> o2 - o1);
        
        score[0][0] = 1; // 1등
        int n = 0; // 같은 점수면 같은 등수를 부여하기 위한 변수
        for(int i = 1; i < score.length; i++) {
            // temp 사용 / 앞 점수와 점수 비교하여 같은 점수면 같은 등수 부여
            if(temp[i - 1] == score[i][0]) { 
                n++;
                 // score 계속 재사용 -> 기대효과 메모리 절약
                score[i][0] = i + 1 - n;
            } else {
                n = 0;
                score[i][0] = i + 1 - n;
            }
        }
        
        // 처음 순서(index)로 다시 정렬 해주면 등수를 알 수 있음.
        Arrays.sort(score, (o1, o2) -> o1[1] - o2[1]);
        for(int i = 0; i < score.length; i++) {
            answer[i] = score[i][0];
        }
        
        return answer;
    }
}