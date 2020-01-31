package marsh.methods;

import org.junit.Test;

import static marsh.methods.MethodsPractice.squareNum;
import static org.junit.Assert.assertEquals;

public class MethodsPracticeTest {

    @Test
    public void SquareNumTest() {
       assertEquals(36, squareNum(6));
    }
}
