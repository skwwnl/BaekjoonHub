import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxNum = arr[0];
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxNum < arr[i])
                maxNum = arr[i];
            if(minNum > arr[i])
                minNum = arr[i];
        }
        System.out.println(minNum + " " + maxNum);
    }
}