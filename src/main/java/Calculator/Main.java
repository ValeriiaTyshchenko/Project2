package Calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    //добавляем логгер вместо распечатки
    private static final Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) {
        double result = Calculator.calculate(2, 3, Calculator.Type.DIVISION);
        //добавляем логгер вместо распечатки
        logger.info("result: " + result);

//try {
    result = Calculator.calculate(22, 3, Calculator.Type.MULTIPLICATION);
        //добавляем логгер вместо распечатки
        logger.info("result: " + result);
//}
//catch (Exception error) {
//    System.out.println("Something wrong");
//}

        result = Calculator.calculate(244, 3, Calculator.Type.SUBTRACTION);
        //добавляем логгер вместо распечатки
        logger.info("result: " + result);
        result = Calculator.calculate(244, 3, Calculator.Type.SUMMARY);
        //добавляем логгер вместо распечатки
        logger.info("result: " + result);
        }


    }

