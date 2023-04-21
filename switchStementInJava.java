import java.util.Scanner;

class SwitchCaseInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee Id");
        int employeeId = sc.nextInt();
        System.out.println("Enter employee department");
        String department = sc.next();
        switch (employeeId) {
            case 1:
                System.out.println("Rohan Vidhate");
                break;
            case 2:
                System.out.println("Roshan Vidhate");
                break;
            case 3:
                System.out.println("Avi Vidhate");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Mechanical":
                        System.out.println("Mecanical department");
                        break;
                    case "CS":
                        System.out.println("CS department");
                        break;
                    default:
                        System.out.println("You entered invalid department");
                }
                break;
            default:
                System.out.println("You enetered invalid employeeId");
        }
        sc.close();
    }
}
