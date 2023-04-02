import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        int ascend_count = 0;
        int descend_count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]+1==arr[i+1]) ascend_count++;
            else if (arr[i]-1==arr[i+1]) descend_count++;
        }

        if(ascend_count==7) System.out.println("ascending");
        else if (descend_count==7) System.out.println("descending");
        else System.out.println("mixed");
    }
}
