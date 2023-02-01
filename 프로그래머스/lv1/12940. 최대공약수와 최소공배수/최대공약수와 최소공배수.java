class Solution {
    public int[] solution(int a, int b) {
        int[] num = new int[2];
        
        num[0] = gcd(a,b);
        num[1] = a*b/gcd(a,b);
        
        return num;
    }
    public static int gcd (int x, int y){
        while(y>0){
            int tmp = x;
            x = y;
            y = tmp%y;
        }
        return x;
    }
}