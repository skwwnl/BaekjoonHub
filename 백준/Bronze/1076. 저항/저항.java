import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>(){{
            put("black", "0");
            put("brown", "1");
            put("red", "2");
            put("orange", "3");
            put("yellow", "4");
            put("green", "5");
            put("blue", "6");
            put("violet", "7");
            put("grey", "8");
            put("white", "9");
        }};

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();


        long answer = Long.parseLong(map.get(str1) + map.get(str2));
        long num = Long.parseLong(map.get(str3));

        long sum = 1;

        for (int i = 0; i < num; i++) {
            sum *= 10;
        }

        System.out.println(answer * sum);
    }
}
