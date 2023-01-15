import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordUtilsTest {
    @Test
    public void getWordInCapitalLettersTest() {
        //given
        String givenWordInput = "java";
        String expectedResult = "JAVA";
        //when
        String actualResult = WordUtils.getWordInCapitalLetters(givenWordInput);
        //then
        assertEquals(actualResult, expectedResult);
        assertNotNull(actualResult);

    }

    @Test
    @DisplayName("Display null word!")
    public void getWordInCapitalLettersNullTest() {
        //given
        String givenWordInput = null;
        //when
        String actualResult = WordUtils.getWordInCapitalLetters(givenWordInput);
        //then
        assertNull(actualResult);

    }

    @Test
    public void convertToDoubleTest() {
        //given
        String birthDayYear = "1998";
        Double expectedResult = 1998d;
        Double unexpextedResult = 1997d;
        //when
        Double actualResult = WordUtils.convertToDouble(birthDayYear);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpextedResult, actualResult);
    }

    @Test
    public void convertToDoubleNullTest() {
        //given
        //when
        Double actualResult = WordUtils.convertToDouble(null);
        //then
        assertNull(actualResult);
    }

    @Test
    public void getDefaultIfNullTest() {

        //given
        String givenName = "Andrei";
        String givenDefaultName = "Pepe";
        String expectedResult = givenName;
        String unexpectedResult = "Lore";
        //when
        String actualResult = WordUtils.getDefaultIfNull(givenName, givenDefaultName);
        //then
        assertEquals(actualResult, expectedResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void getDefaultIfNullNameIsNullTest() {

        //given
        String givenName = null;
        String givenDefaultName = "Pepe";
        String expectedResult = givenDefaultName;
        //when
        String actualResult = WordUtils.getDefaultIfNull(givenName, givenDefaultName);
        //then
        assertEquals(actualResult, expectedResult);
        assertNotNull(actualResult);
    }

    @Test
    public void isNullOrBlankOrEmptyTest() {
        //given
        String givenName = "Patrocle";
        Boolean expectedResult = false;
        Boolean unexpectedResult = true;
        //when
        Boolean actualResult = WordUtils.isNullOrBlankOrEmpty(givenName);
        //than
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertFalse(actualResult);
    }

    @Test
    public void isNullOrBlankOrEmptyTest2() {
        //given
        String givenName = "";
        Boolean expectedResult = true;
        Boolean unexpectedResult = false;
        //when
        Boolean actualResult = WordUtils.isNullOrBlankOrEmpty(givenName);
        //than
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertTrue(actualResult);
    }

    @Test
    public void isNullOrBlankOrEmptyTest3() {
        //given
        String givenName = "    ";
        Boolean expectedResult = true;
        Boolean unexpectedResult = false;
        //when
        Boolean actualResult = WordUtils.isNullOrBlankOrEmpty(givenName);
        //than
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertTrue(actualResult);
    }

    @Test
    public void concatWithNullArrayTest() {
        //given
        String[] givenName = null;
        String expectedResult = null;
        String unexpectedResult = "Patrocle";
        //when
        String actualResult = WordUtils.concat(givenName);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNull(actualResult);
    }

    @Test
    public void concatWithEmptyArrayTest() {
        //given
        String[] givenName = {};
        String expectedResult = null;
        String unexpectedResult = "Patrocle";
        //when
        String actualResult = WordUtils.concat(givenName);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNull(actualResult);
    }
    @Test
    public void concatWithWordsArrayTest() {
        //given
        String[] givenName = {"Ana"," ","are"," ","mere"};
        String expectedResult = "Ana are mere";
        String unexpectedResult = "Patrocle";
        //when
        String actualResult = WordUtils.concat(givenName);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }
    @Test
    public void concatWithWordsHaveOneNullArrayTest() {
        //given
        String[] givenName = {"Ana",null," ","are",null," ","mere"};
        String expectedResult = "Ana are mere";
        String unexpectedResult = "Patrocle";
        //when
        String actualResult = WordUtils.concat(givenName);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }
}
