import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CalTest {

    private static Cal cal;

    @Before
    public void init() {
        cal = new Cal();
    }

    @org.junit.Test
    // test for integer and double additon
    public void testAdd() {

        ////System.out.println(cal.Add(2,3));
        assertThat(cal.add(2, 4), is(6));
        assertThat(cal.add(3.0, 2.0), is(5.0));
        // assertThat(cal.Add(6,0),is("6"));
    }

    //test for valid string input
    @Test
    public void testBothStringADDTrue() {
        assertEquals(7, cal.add("3", "4"));
    }

    // "test for wrong string inputs "
    @Test(expected = NumberFormatException.class)
    public void testBothStringADDFalse() {
        int ans = cal.add("w", "3");
    }

    //test for char input in addition
    @Test(expected = AssertionError.class)
    public void testAddStringCheck() {
        assertThat(cal.add('a', 3), is("Error"));
    }

    //test case for addition overflow
    @Test(expected = ArithmeticException.class)
    public void checkOverFlow() throws ArithmeticException {
        int ans = cal.addOverFlow(2147483647, 99);
    }

    // test case for subtraction for double and integer
    @Test
    public void sub() {

        assertThat(cal.sub(3, 1), is(2.0));
        assertThat(cal.sub(3.0, 2.0), is(1.0));
    }

    //test case for invalid char input for subtraction
    @Test(expected = AssertionError.class)

    public void testSubStringCheck() {
        assertThat(cal.Sub('d', 5), is("error integer expected "));
    }

    @Test()
    public void testDiv() {

        assertThat(cal.division(2, 1), is(2.0));
        //assertThat(cal.Div(2,0),is(-999));
    }

    //Test case for division by zero
    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {

        assertThat(cal.division(2, 0), is("NOT DIVISIBLE BY ZERO"));
    }

    //Test case for Multiplication
    @Test
    public void multi() {
        assertThat(cal.multi(2, 3), is(6));
        assertThat(cal.multi(2.0, 3.0), is(6.0));
    }

    //Test Case for Multiplication overflow
    @Test(expected = ArithmeticException.class)
    public void checkOverFlowMulti() throws ArithmeticException {
        int ans = cal.multiOverFlow(2147483647, 99);
    }


}