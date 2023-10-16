package Accenture;
import java.util.*;
public class camelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                res.append('\n');
                res.append(Character.toLowerCase(str.charAt(i)));
            } else if (Character.isLowerCase(str.charAt(i))) {
                res.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(res);
    }
}

