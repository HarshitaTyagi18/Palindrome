import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String name = sc.next();
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            str = str + name.charAt(i);
        }
        if (str.equals(name) == true) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }

    }
}
