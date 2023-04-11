import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 학생 수를 입력
        // 2. 학생 수에 맞게 int 2차원 배열 선언
        // 3. 학생들이 속한 반을 입력
        // 4. 같은 반 개수 비교

        int maxStudent = 0;
        int result = 0;

        // 1번
        int N = Integer.parseInt(st.nextToken());

        // 2번
        int[][] arr = new int[N][5];

        // 3번
        for (int i = 0; i < N; i++) {
            String num = br.readLine();
            StringTokenizer st1 = new StringTokenizer(num, " ");
            int j = 0;
            while(st1.hasMoreTokens()){
                arr[i][j] = Integer.parseInt(st1.nextToken());
                j++;
            }
        }

        // 4번
        for (int i = 0; i < N; i++) {
            Set<Integer> sameClass = new HashSet<>();

            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < N; k++) {
                    if(arr[i][j]==arr[k][j] && k != i) {
                        sameClass.add(k);
                    }
                }
            }

            // 반장 학생 찾기
            if(maxStudent < sameClass.size()){
                maxStudent = sameClass.size();
                result = i;
            }
        }

        System.out.println(result+1);
    }
}