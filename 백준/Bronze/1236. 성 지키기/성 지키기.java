import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 1. 행과 열의 개수를 입력
        // 2. 경비원의 배치 상태를 2차원 배열에 저장
        // 3. 행을 기준으로 각 열들을 비교하여 경비원의 수를 계산

        // 1번
        // N = 행, M = 열
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2번
        // Char형 2차원 배열 선언
        char[][] arr = new char[N][M];

        // 경비원 상태 값 넣기
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        // 3번
        // 경비원 행 기준
        int count_row = checkGuardRow(arr, N, M);
        int count_col = checkGuardCol(arr, M, N);

        System.out.println(Math.max(count_row, count_col));
    }

    // 3번 경비원 확인용 메소드
    private static int checkGuardRow(char newArr[][], int a, int b){
        int count = 0;
        int check = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(newArr[i][j] == 'X') {
                    check++;
                    break;
                }
            }
            if(check==0)
                count++;
            check = 0;
        }
        return count;
    }

    private static int checkGuardCol(char newArr[][], int a, int b){
        int count = 0;
        int check = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(newArr[j][i] == 'X') {
                    check++;
                    break;
                }
            }
            if(check==0)
                count++;
            check = 0;
        }
        return count;
    }
}