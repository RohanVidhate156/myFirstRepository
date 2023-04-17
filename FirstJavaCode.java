// To find sum of elements in an array.
class sumOfArray {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 23, 89, 76, 29, 100 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements in an array is " + sum + ".");

    }
}
