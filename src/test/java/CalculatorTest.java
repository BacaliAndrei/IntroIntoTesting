import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("This prints before each test");
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("This prints after each test");
    }

    @BeforeAll
    public static void logTimeWhenTestsStarted() {
        System.out.println("Started tests at: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @AfterAll
    public static void logTimeWhenTestsEnded() {
        System.out.println("Ended tests at: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
    @Test
    public void addTest() {
        //given
        Calculator calculator = new Calculator();
        double firstNumber = 12;
        double secondNumber = 10;
        Double expectedResult = 22d;
        Double unexpectedResult = 918d;

        //when
        Double actualResult = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void subtractTest() {

        //given
        Calculator calculator = new Calculator();
        double firstNumber = 11;
        double secondNumber = 7;
        Double expectedResult = 4d;
        Double unexpectedResult = 11d;
        //when
        Double actualResult = calculator.subtract(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void subtractWithNegativeTest() {
        //given
        Calculator calculator = new Calculator();
        double firstNumber = 11;
        double secondNumber = -7;
        Double expectedResult = null;
        Double unexpectedResult = 20d;
        //when
        Double actualResult = calculator.subtract(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNull(actualResult);
    }


    @Test
    public void multiplyTest() {
        //given
        Calculator calculator = new Calculator();
        double firstNumber = 10;
        double secondNumber = 8;
        Double expectedResult = 80d;
        Double unexpectedResult = 44d;
        //when
        Double actualResult = calculator.multiply(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void divideTest() {
        //given
        Calculator calculator = new Calculator();
        double firstNumber = 64;
        double secondNumber = 8;
        Double expectedResult = 8d;
        Double unexpectedResult = 9d;
        //when
        Double actualResult = calculator.divide(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void divideWithZeroTest() {
        //given
        Calculator calculator = new Calculator();
        double firstNumber = 64;
        double secondNumber = 0;
        Double expectedResult = null;
        Double unexpectedResult = 9d;
        //when
        Double actualResult = calculator.divide(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNull(actualResult);
    }

    @Test
    public void reverseSingTest() {
        //given
        Calculator calculator = new Calculator();
        int number = 2;
        Integer expectedResult = -2;
        Integer unexpectedResult = 2;
        //when
        Integer actualResult = calculator.reverseSing(number);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
    }


}
