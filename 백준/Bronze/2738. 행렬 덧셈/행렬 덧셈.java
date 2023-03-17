import java.util.Scanner;



class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] num1 = new int[a][b];
        int[][] num2 = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                num1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                num2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print(num1[i][j] + num2[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}