import java.util.*;

public class charges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int n  = sc.nextInt();
        int r2 = sc.nextInt();
        int x  = sc.nextInt();

        x = x + 59;
        int hr = x / 60;
        int cost;

        if (hr <= n)
            cost = hr * r1;
        else
            cost = (n * r1) + ((hr - n) * r2);

        System.out.println(cost);

        String str1 = "hello";
        String str2 = "help";

        System.out.println(function(str1, str2));
    }

    public static int function(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (str1.indexOf(c) == -1) count++;
        }
        return count;
    }
}
