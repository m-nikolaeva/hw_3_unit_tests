import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.gb.MainHW;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class NumbersTest {
    private MainHW mainHW;

    @BeforeEach
    void setUp(){
        mainHW = new MainHW();
    }
    @Test
    void testEvenNumber(){
        assertTrue(mainHW.evenOddNumber(4));
    }

    @Test
    void testNotEvenNumber(){
        assertFalse(mainHW.evenOddNumber(3));
    }

    @Test
    void testNumberInIntervalLeft(){
        assertTrue(mainHW.numberInInterval(26));
    }

    @Test
    void testNumberInIntervalRight(){
        assertTrue(mainHW.numberInInterval(99));
    }

    @Test
    void testNumberInIntervalCentral(){
        assertTrue(mainHW.numberInInterval(63));
    }

    @Test
    void testNumberOutIntervalLeft(){
        assertFalse(mainHW.numberInInterval(25));
    }

    @Test
    void testNumberOutIntervalRight(){
        assertFalse(mainHW.numberInInterval(100));
    }

}
