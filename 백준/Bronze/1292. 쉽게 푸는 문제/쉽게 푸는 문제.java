import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        final int MAX_NUM = 1000;

        Scanner sc = new Scanner(System.in);
        // 1. 수열 만들기 ( int[] arr 선언 )
        // 2. 수열의 시작과 끝에 대한 수를 입력
        // 3. 중간 지정 후 합 구하기

        int[] seNum = new int[MAX_NUM]; // 수열을 담을 배열
        int cnt = 0;                    // 배열에 사용할 인덱스 변수
        int sum = 0;                    // 선택한 값들의 합인 변수

        // 1번
        for (int i = 0; i < MAX_NUM; i++) {
            for (int j = 0; j < i+1; j++) {
                if(cnt==MAX_NUM)
                    break;
                seNum[cnt++] = i+1;
            }
        }

        // 2번
        int B = sc.nextInt();
        int E = sc.nextInt();

        // 3번
        for (int i = B-1; i < E; i++) {
            sum += seNum[i];
        }

        System.out.println(sum);


    }
}