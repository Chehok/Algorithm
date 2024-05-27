import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger _a = new BigInteger(a);
        BigInteger _b = new BigInteger(b);
        
        return _a.add(_b).toString();
    }
}