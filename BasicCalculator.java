import java.util.*;

public class BasicCalculator
 {

    // Create a method for addition
    public static double add(double a, double b) 
    {
        return a + b;
    }

    // Create a method for subtraction
    public static double subtract(double a, double b) 
    {
        return a - b;
    }

    // Create a method for multiplication
    public static double multiply(double a, double b)
    {
        return a * b;
    }

    // Create a method for division
    public static double divide(double a, double b) 
    {
        if (b == 0) 
        {
            System.out.println("Cannot divide by zero.");
            
        }
        return a / b;
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        boolean Running = true;

        while (Running) {
            System.out.println("\n ******Basic Calculator******");
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt();

            if (choice == 5) {
                Running = false;
                System.out.println("Exit");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) 
                    {
                        System.out.println("Result: " + result);
                    }
                    break;

            

                default:
                    System.out.println("Invalid choice. Please select between 1 and 5.");
            }
        }

        sc.close();
    }
}
