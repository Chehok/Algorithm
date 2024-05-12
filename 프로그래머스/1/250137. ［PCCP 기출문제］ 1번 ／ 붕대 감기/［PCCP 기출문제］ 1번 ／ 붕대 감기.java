class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int idx = 0;
        int time = 0;
        int healTime = 0;
        int nowHp = health;
        
        while(idx < attacks.length) {
            time++;
            healTime++;
            if(attacks[idx][0] == time) {
                nowHp -= attacks[idx++][1];
                healTime = 0;
                if(nowHp <= 0) return -1;
            } else {
                if(nowHp + bandage[1] <= health) nowHp += bandage[1];
                else nowHp = health;
                if(healTime >= bandage[0]){
                    if(nowHp + bandage[2] <= health) nowHp += bandage[2];
                    else nowHp = health;
                    healTime = 0;
                } 
            }
        } 
        return nowHp;
    }
}

/* 
bandage - 초, 회복, 성공시 회복
5, 1, 5 => 5초 동안 1씩 회복, +5 회복 가능


*/