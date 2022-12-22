package StaticClassesEnumsExceptions;

public class Main {
    public static void main(String[] args) {
        double result = Calculator.calculate(2, 3, Calculator.Type.DIVISION);
        System.out.println("result: " + result);

//try {
    result = Calculator.calculate(22, 3, null);
    System.out.println("result: " + result);
//}
//catch (Exception error) {
//    System.out.println("Something wrong");
//}

        result = Calculator.calculate(244, 3, Calculator.Type.SUBTRACTION);
        System.out.println("result: " + result);
        result = Calculator.calculate(244, 3, Calculator.Type.SUMMARY);
        System.out.println("result: " + result);
        }


    }

