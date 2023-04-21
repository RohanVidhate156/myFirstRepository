import java.util.Scanner;

class JavaGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = sc.nextInt();
        System.out.println("Enter number2");
        int number2 = sc.nextInt();
        System.out.println("Greatest number is :" + GreatestNumber(number1, number2));
        sc.close();
    }

    public static int GreatestNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }

    }
}