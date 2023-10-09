import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathFunctionTests {
    @Test
    public void oneTwoThree(){
        int[] numbers = {1, 2, 3};
        assertEquals("+",  App.mathFunction(numbers));
    }
    @Test
    public void twoTwoFour(){
        int[] numbers = {2, 2, 4};
        assertEquals("+*",  App.mathFunction(numbers));
    }
    @Test
    public void threeNegativeThreeNegativeNine(){
        int[] numbers = {3, -3, -9};
        assertEquals("*",  App.mathFunction(numbers));
    }
    @Test
    public void oneTwoNegativeOne(){
        int[] numbers = {1, 2, -1};
        assertEquals("-",  App.mathFunction(numbers));
    }
    @Test
    public void threeThreeOne(){
        int[] numbers = {3, 3, 1};
        assertEquals("/",  App.mathFunction(numbers));
    }
    @Test
    public void sevenOneEleven(){
        int[] numbers = {7, 1, 11};
        assertEquals("None",  App.mathFunction(numbers));
    }
}
