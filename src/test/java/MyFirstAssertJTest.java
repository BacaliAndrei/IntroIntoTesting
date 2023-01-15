import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstAssertJTest {

    @Test
    public void assertJNumberTest() {
        //given
        Calculator calculator = new Calculator();
        //when
        Double actualResult = calculator.divide(2, 4);
        //then
        Assertions.assertThat(actualResult)
                .isPositive()
                .isEqualTo(6d)
                .isNotEqualTo(4d)
                .isNegative()
                .isNotZero()
                .isIn(1d, 2d, 3d, 4d, 5d, 6d)
                .isBetween(1d, 9d);

    }
    @Test
    public void assertJStringTest(){
        String name="patrocle";
        Assertions.assertThat(name)
                .isEqualTo("patrocle")
                .isNotEqualTo("doe")
                .isNotBlank()
                .isNotEmpty()
                .isNotNull()
                .startsWith("j")
                .endsWith("n");
    }
}
