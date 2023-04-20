
import java.util.Scanner;

public class removeAnElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size - 1];
        System.out.println("get value from user:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Print given array");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("Enter the index of value do you want to delete:");
        int m = sc.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (i < m) {
                arr2[i] = arr1[i];
            } else if (i == m) {
                continue;
            } else {
                arr2[i - 1] = arr1[i];
            }
        }
        System.out.println("Elements are:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        sc.close();
    }
}
