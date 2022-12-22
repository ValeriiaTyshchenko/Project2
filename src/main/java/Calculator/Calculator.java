package Calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

//    enum final constants
//добавляем логгер вместо распечатки, тоже самое делаем в маин
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public enum Type{
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION

    }

    public static double calculate(double a, double b, Type type) {
        //добавляем логгер вместо распечатки
        logger.info("Running method calculate");
        double result = 0;


        // we cxan do it with else
//        if (type == MULTIPLICATION) {
//            return a * b;
//        }
//        else if(type == SUMMARY);

        // we can do it with if switch case
        try {


            switch (type) {
                case MULTIPLICATION:
                    result = a * b;
                    break;
                case SUMMARY:
                    result = a + b;
                    break;
                case DIVISION:
                    result = a / b;
                    break;
                case SUBTRACTION:
                    result = a - b;
                    break;

                default:
                    result = -1;


            }
        }

            catch (Exception error) {
                //добавляем логгер вместо распечатки
                logger.error("Something wrong", error);
                throw error;
            }
//        finally {
//            System.out.println("Finally block");
//            result = -1;
//        }
        return result;

    }


}