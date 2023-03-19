import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yearNum = sc.nextInt();
        int result = 0;
        if (yearNum % 4 == 0) {
            if (yearNum % 100 != 0) {
                result = 1;
            } else if(yearNum % 400 == 0){
                result = 1;
            }
        }
        System.out.println(result);
    }
}