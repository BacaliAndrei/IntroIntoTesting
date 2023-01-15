import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstJUnitClass {

    @Test
    public void myFirstJUnitTest() {

        System.out.println("this prints in JUnit test");
    //API=application programing interface
    }

    @Test
    public void myFirstAssertEqualsTest() {
        int expected = 64;
        int firstNumber = 32;
        int secondNumber = 2;

        Assertions.assertEquals(expected, firstNumber * secondNumber);
    }
    @Test
    public void myFirstNotEqualsTest(){
        int expected = 64;
        int firstNumber = 32;
        int secondNumber = 3;

        Assertions.assertNotEquals(expected, firstNumber * secondNumber);

    }

    @Test
    public void myFirstAssertTrueFalseTest(){
        boolean isWhite=true;
        Assertions.assertTrue(isWhite);
        Assertions.assertFalse("isWhite".equals("isBlack"));
    }
    @Test
    public void myFirstNullTest(){
        String firstWord="hello";
        String seccondWord=null;
        Assertions.assertNotNull(firstWord);
        Assertions.assertNull(seccondWord);
    }

}
