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
 */

class InteractiveCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double result;

        System.out.println("Give me a number please: ");
        double a = scanner.nextInt();
        //scanner.nextInt();
        System.out.println("Please give me another number: ");
        double b = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Please give me an operation: ");
        String operation = scanner.nextLine();

        System.out.println(a + " " + operation + " " + b);

        operation = operation.toLowerCase();

        switch(operation){
            case "add":
                AddOperation addOperation = new AddOperation(a, b);
                result = addOperation.getAddResult();
                System.out.println("Add result: " + result);
                break;
            case "subtract":
                SubtractOperation subtractOperation = new SubtractOperation(a, b);
                result = subtractOperation.getSubtractionResult();
                System.out.println("Subtract result: " + result);
                break;
            case "multiply":
                MultiplyOperation multiplyOperation = new MultiplyOperation(a, b);
                result = multiplyOperation.getMultiplyResult();
                System.out.println("multiplication result: " + result);
                break;
            case "divide":
                if(b == 0){
                    System.out.println("ERROR: Cannot divide by 0.");
                    return;
                }
                DivideOperation divideOperation = new DivideOperation(a, b);
                result = divideOperation.getDivideResult();
                System.out.println("divide operation result: " + result);
                break;
        }

    }
}
