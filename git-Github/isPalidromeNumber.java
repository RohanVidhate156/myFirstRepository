import java.util.Scanner;

public class isPalidromeNumber {
    int isPalidrome(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        if (s.equals(reverse))
            return 1;
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string name");
        String s = sc.next();
        isPalidromeNumber p = new isPalidromeNumber();
        System.out.println(p.isPalidrome(s));
        sc.close();
    }

}
