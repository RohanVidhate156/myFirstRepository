class JavaFinallyKeyword {
    public static void main(String[] args) {
        int z = 55;
        try {
            if (z / 0 == 0) {
                System.out.println("Exception occurs");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e);

        } finally {
            System.out.println("Executes whether exception occurs or not");
        }
    }
}