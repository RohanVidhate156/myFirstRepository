import java.util.Scanner;
import java.util.Arrays;

class RemoveElementFromAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements in an array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("This are array elements that user entered recently:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the element which you want find in an array:");
        int element = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("The number " + element + " Found at index " + i);
            }
        }
        sc.close();
    }
}
