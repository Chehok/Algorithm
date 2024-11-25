class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int a = 0;
        
        for(String p: polynomial.split(" \\+ ")) {
            if(p.contains("x")) {
                if(p.length() == 1) {
                    x++;
                } else {
                    x += Integer.parseInt(p.replaceAll("x", ""));
                }
            } else {
                a += Integer.parseInt(p);
            }
        }
        
        if(x > 0)  {
            if(x > 1) sb.append(x);
            sb.append("x");
        }
        if(a > 0) {
            if(sb.length() > 0) sb.append(" + ");
            sb.append(a);
        }
        
        return sb.toString();
    }
}