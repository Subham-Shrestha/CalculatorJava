import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            while (true) {
                Scanner takeInput = new Scanner(System.in);

                System.out.print("Enter a whether to start or quit the calculator : ");
                String guess = takeInput.nextLine().trim().toLowerCase();

                if (guess.equals("start")) {
                    System.out.print("Enter the first number: ");
                    double num1 = takeInput.nextDouble();

                    System.out.print("Enter the second number: ");
                    double num2 = takeInput.nextDouble();


                    System.out.println("Select what you want to do :");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.print("Enter the operation from the above number : ");
                    int choice = takeInput.nextInt();

                    double result;
                    if (choice == 1) {
                        result = num1 + num2;
                        System.out.println("The sum is : " + result);

                    } else if (choice == 2) {
                        result = num1 - num2;
                        System.out.println("The difference is : " + result);

                    } else if (choice == 3) {
                        result = num1 * num2;
                        System.out.println("The product is : " + result);

                    } else if (choice == 4) {
                        result = num1 / num2;
                        System.out.println("The division is : " + result);
                    } else {
                        System.out.println("Invalid operation.");
                    }
                } else if (guess.equals("quit")) {
                    System.out.println("Calculator is exited!!");
                    return;
                } else {
                    System.out.println("Input invalid.");
                }


            }
        }
}
