/*this program will add two numbers*/
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Select an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
       
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
                
            case2:
		result=num1-num2;
		System.out.println("Theresultofsubtractionis:"+result);
		break;

            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            
            default:
                System.out.println("Invalid operation.");
        }
    }
}
