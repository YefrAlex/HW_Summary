package JavaPro.lesson25_unit_test.task1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilsTest {
    private int[] result;
    @Before
    public void init(){
        result = ArrayUtils.getArrayBySize(7);
    }
    @Test
   public void checkInnerValue() {

       int expected =5;
       int actual = result[4];
       assertEquals(expected, actual);
    }
    @Test
    public void checkCorrectSize(){

        int expected = 7;
        int actual = result.length;
        assertEquals(expected,actual);
    }
    @Test
    public void checckNotNull(){
        assertNotNull("Проверка не возвращается ли null", result);
    }
    @Test(expected = RuntimeException.class)
    public void checkExpectedException(){
        int[] result = ArrayUtils.getArrayBySize(-3);
    }
    @Test
    public void checkExpectedExceptionSecondWay(){
        try {
            int[] result = ArrayUtils.getArrayBySize(-3);
        } catch (RuntimeException e){
            return;
        }
        fail();
    }
}