class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);
        long answer = 0;
        if(n ==(long)Math.pow(x, 2))
            answer = (x+1)*(x+1);
        else
            answer = -1;
        return answer;
    }
}