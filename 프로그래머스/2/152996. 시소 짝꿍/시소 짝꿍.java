import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public long solution(int[] weights) {
        long result = 0;
        HashMap<Integer, Integer> hm = new HashMap<>(); // 배열을 돌고 값을 저장함
        int[] newArr;
        
        for(int i: weights) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        // 같은 수끼리 쌍을 맺는 경우
        for(long l: hm.values()) result += l * (l - 1) / 2;
        
        // 다른 수끼리 쌍을 맺는 경우
        newArr = new int[hm.size()];
        
        int idx = 0;
        for(int i: hm.keySet()) {
            newArr[idx++] = i;
        }
        
        Arrays.sort(newArr);
        
        for(int i = 0; i < newArr.length - 1; i++) {
            for(int j = i + 1; j < newArr.length; j++) {
                double a = newArr[i];
                double b = newArr[j];
                
                if (a * 2.0 == b
                   || a * 3.0 / 2.0 == b
                   || a * 4.0 / 3.0 == b) {
                    long x = hm.get(newArr[i]);
                    long y = hm.get(newArr[j]);
                    result += x * y;
                }
                    
            }
        }
        return result;
    }
}

/* 4, 3, 2 - - 2, 3, 4

A가 4, B가 2에 앉으면 무게 비율 4:2/4

b/a

1. for문 2개 중첩 -> N^2
2. 같은 번호가 몇개인지 갯수 파악
ex1) [100, 100, 100, 100] -> 조합 4C2 와 같음 -> 6개의 쌍 == 4 * 3 / 2
ex2) [100, 100, 200, 100] -> {100, 100} x 3 + {200, 100} x 3
->  1) 100 끼리 짝인 경우 3C2
    2) 200 과 짝을 맺는 100 3명
이를 구하는 법, 
1. 100의 갯수를 셈 (100 만 여러개 중첩되니까)
2. 맨 처음 100이 100이 아닌 다른 수를 몇개 만났는지 체크함.
3. 그리고 100을 hashmap에 저장함.

ex3) [100, 200, 100, 200, 100]
3C2, 2C2
2(200의 갯수) x 3(100의 갯수) -> ? 어라? 잠깐만.. 간단한 수식으로 값이 결정되나? (hashmap을 안써도 되나?)

ex4) [100, 200, 300, 100, 200, 300] -> {100, 200}, {200, 300}, {100, 300} X
2C2, 2C2, 2C2

100이 2개, 200이 2개 -> 4쌍
200 2, 300 2 -> 4쌍

이러면 for 문 한번으로 배열을 한번만 돌면 O(n) 알고리즘 구현 가능!


해결 과정
1. 해당 idx 의 수가 다른 수와 짝을 맺는지 확인한다.
1-1. 2, 3, 4 에 앉으면서 다른 수를 2, 3, 4 에 앉혀보며 확인함. (for문)
1-2. 
2. 짝을 맺은 값을 hashmap 에 저장

알고리즘에 사용될 기법 -> for, hashmap 끝? ㅇㅋ 시도

같은 수의 경우 중첩을 제한한다는 지문은 없다.

*/