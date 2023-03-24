import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arrCard = new int[N];

        for (int i = 0; i < N; i++) {
            arrCard[i] = sc.nextInt();
        }

        System.out.println(bruteSearch(arrCard, N, M));

    }

    private static int bruteSearch(int[] arrCard, int N, int M){

        int result = 0;

        for (int i = 0; i < N-2; i++) {

            for (int j = i + 1; j < N-1; j++) {

                for (int k = j + 1; k < N; k++) {

                    int approxNum = arrCard[i] + arrCard[j] + arrCard[k];

                    if(M == approxNum)
                        return approxNum;

                    if(result < approxNum && approxNum < M)
                        result = approxNum;
                }
            }
        }

        return result;
    }
}
