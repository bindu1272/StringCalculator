import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    private static StringCalculator  stringCalculator;
    @BeforeClass
    public static void init(){
        stringCalculator =  new StringCalculator();
    }
    @Test
    public void add() throws Exception {
        //Testcase1
        assertEquals(0, stringCalculator.add(""));

        //Testcase2
        assertEquals(3+6, stringCalculator.add("3,6"));
        assertEquals(3, stringCalculator.add("3"));
        assertEquals(3+6+15+18+46+33, stringCalculator.add("3,6,15,18,46,33"));

        //Testcase3
        assertEquals(3+6+15, stringCalculator.add("3,6\n15"));

        //Testcase4
        assertEquals(3+6+15, stringCalculator.add("//;\n3;6;15"));

        //Testcase5
        Exception exception = null;
        try {
            stringCalculator.add("3,-9,40,-1,42,31");
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull("Exception was not thrown", exception);
        assertEquals("negatives not allowed : [-9, -1]", exception.getMessage());

        //Testcase6
        assertEquals(3+1000+6, stringCalculator.add("3,1000,1009,6,1334"));

        //Testcase7
        assertEquals(1+2+3,stringCalculator.add("//[***]1***2***3"));

        //Testcase8
        assertEquals(1+2+3,stringCalculator.add("//[*][%]\n1*2%3"));

        //Testcase9
        assertEquals(4+5+6,stringCalculator.add("//[*]4\n5;6"));
    }

}
