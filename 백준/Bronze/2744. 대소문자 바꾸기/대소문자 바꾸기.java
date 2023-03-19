import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        String str = sc.nextLine();
        String result_str = "";

        for (int i = 0; i < str.length(); i++) {
            tmp = (int)str.charAt(i);
            if((65<=tmp)&&(90>=tmp)){
                result_str += (char)(tmp + 32);
            }
            if((97<=tmp)&&(122>=tmp)){
                result_str += (char)(tmp - 32);
            }
        }
        System.out.println(result_str);
    }
}
