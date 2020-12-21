package calculator;

import calculator.operations.AddOperation;
import calculator.operations.DivideOperation;
import calculator.operations.MultiplyOperation;
import calculator.operations.SubtractOperation;

import java.util.Scanner;

/*
    Requirements:
    - two numbers as inputs
    - take the operator
        - add / subtract / divide / multiply
    - print the result to console


    Modifiers used in this project: public, default(no modifier), private
 */

class InteractiveCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double result;

        System.out.println("Enter number A: ");
        double a = scanner.nextDouble();

        System.out.println("Enter number B: ");
        double b = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Please give me an operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();

        operation = operation.toLowerCase();

        switch(operation){
            case "add":
                AddOperation addOperation = new AddOperation(a, b);
                result = addOperation.getAddResult();
                System.out.println(a + " " + operation +" "+ b + " = " + result);
                break;
            case "subtract":
                SubtractOperation subtractOperation = new SubtractOperation(a, b);
                result = subtractOperation.getSubtractionResult();
                System.out.println(a + " " + operation +" "+ b + " = " + result);
                break;
            case "multiply":
                MultiplyOperation multiplyOperation = new MultiplyOperation(a, b);
                result = multiplyOperation.getMultiplyResult();
                System.out.println(a + " " + operation + " " + b + " = " + result);
                break;
            case "divide":

                if(b == 0){
                    System.out.println("ERROR: Cannot divide by 0.");
                    return;
                }

                DivideOperation divideOperation = new DivideOperation(a, b);

                result = divideOperation.getDivideResult();
                System.out.println(a + " " + operation + " "+ b + " = " + result);
                break;
            default:
                System.out.println("Operation not recognized");
                break;
        }

    }
}
