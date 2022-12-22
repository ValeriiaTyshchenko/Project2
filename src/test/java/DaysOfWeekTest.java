
import listOfDays.DaysOfWeek;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class DaysOfWeekTest {
//    static Stream<Arguments> dataProvider() {
//        return Stream.of(
//                Arguments.of(1, "Sunday"),
//                Arguments.of(2, "Monday"),
//                Arguments.of(3, "Tuesday"),
//                Arguments.of(4, "Wednesday"),
//                Arguments.of(5, "Thursday"),
//                Arguments.of(6, "Friday"),
//                Arguments.of(7, "Saturday")
//
//
//        );
//    }


//    @ParameterizedTest
//    @MethodSource("dataProvider")
//    public void positiveTeatsAllParameters(int dayNumber, String expectedResult) {
//        String actualResult;
//        actualResult = DaysOfWeek.getDay(dayNumber);
//        assertEquals(expectedResult, actualResult);
//
//    }


//    or


    @ParameterizedTest
    @CsvSource({"1, Sunday", "2, Monday", "3, Tuesday", "4, Wednesday", "5, Thursday", "6, Friday", "7, Saturday"})
    public void csvPositiveTeats(int dayNumber, String expectedResult) {
        String actualResult;
        actualResult = DaysOfWeek.getDay(dayNumber);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void csvNegativeTeats() {
        int dayNumber = 8;
        assertFalse(dayNumber < 1, "Enter number from 1 to 7");
        assertFalse(dayNumber > 7, "Enter number from 1 to 7");

    }

    @Test
    @DisplayName("NullPointer Exception test")
    public void errorTests() {
        int dayNumber;
        assertThrows(NullPointerException.class, () -> {
            DaysOfWeek.getDay(null);
        });


    }
}


