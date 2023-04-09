import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1. 비교할 문자열 개수 입력.
        // 2. 비교할 기준 문자열을 입력.
        // 3. 나머지 문자열을 입력.
        // 4. 기준 문자열과 나머지 문자열을 각각 비교.
        // 5. 비교가 끝난 문자열을 기준 문자열로 교체.


        // 1번
        int N = sc.nextInt();

        // 2번
//        String[] std = new String[N];
        String std = sc.next();
        String newStr = "";

        // 3번
        for (int i = 0; i < N-1; i++) {
            String remain = sc.next();
            //4번
            for (int j = 0; j < std.length(); j++) {
                if(std.charAt(j)==remain.charAt(j))
                    newStr += std.charAt(j);
                else
                    newStr += "?";
            }
            std = newStr;
            newStr = "";
        }
        System.out.println(std);
    }
}