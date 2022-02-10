import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Slf4j
public class CalculatorTest {
    CalculatorForTest casio = new CalculatorForTest();

    @Test
    public void sumMethodTest() {
        int result = casio.sum(5, 2);
        //System.out.println(result);
        assertEquals(7, casio.sum(5, 2));
        assertEquals(10, casio.sum(5, 5));
        // Assertions.assertEquals(10,casio.sum(5,5)); polnaja zapis, sokratit Alt+Enter
        assertEquals(15, casio.sum(5, 10));
    }

    @Test
    public void substructMethodTest() {
        log.info("Testing subtruct method");
        //int result = casio.substract(8,8);
        assertEquals(8, casio.substract(15,7));
    }

    @Test
    public void devideMethodTest() {

        assertEquals(6,casio.devide(12,2));
    }

    @Test
    public void multiplyMethodTest() {
        assertEquals(24,casio.multiply(12,2));
    }
    @Test
    public void objectNameTest(){
            log.info("Testing name");
    {assertEquals("V2022",casio.getModelName(),"wrong name");}
}}
