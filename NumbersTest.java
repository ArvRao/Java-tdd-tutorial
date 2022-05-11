// import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

// * Test class
public class NumbersTest {
    //? List of unit test cases

    //* Addition
    @Test
    public void twoPlustwoEqualsFour(){
        Numbers nums = new Numbers();
        assertEquals(4, nums.add(2, 2));
        assertTrue(nums.add(2, 2) == 4);
        assertNotEquals(25, nums.add(2, 2));
    }

    @Test
    public void twentyThreePlusEighteen() {
        Numbers nums = new Numbers();
        assertEquals(41, nums.add(23, 18));
    }

    @Test
    public void zeroPlusZero() {
        Numbers nums = new Numbers();
        assertEquals(0, nums.add(0, 0));
    }

    @Test
    public void minusTwelvePlusNine() {
        Numbers nums = new Numbers();
        assertEquals(-3, nums.add(-12, 9));
    }


    //* Multiplication
    @Test
    public void tenTimesSeven() {
        Numbers nums = new Numbers();
        assertEquals(70, nums.multiply(10,7));
    }

    @Test
    public void minusFiveTimesSix() {
        Numbers nums = new Numbers();
        assertEquals(-30, nums.multiply(-5,6));
    }

    @Test
    public void EighteenTimesZero() {
        Numbers nums = new Numbers();
        assertEquals(0, nums.multiply(18,0));
        assertNotEquals(92, nums.multiply(18,0));
        assertTrue(nums.multiply(18,0) == 0);
    }


    //* Substraction Tests
    @Test
    public void EightyMinusFourteen() {
        Numbers subtractNums = new Numbers();
        assertEquals(66, subtractNums.substract(80,14));
        assertNotEquals(46, subtractNums.substract(80,14));
        assertTrue(subtractNums.substract(80,14) == 66);
    }

    @Test
    public void SeventeenMinusZero() {
        Numbers subtractNums = new Numbers();
        assertEquals(17, subtractNums.substract(17,0));
        assertNotEquals(1, subtractNums.substract(17,0));
        assertTrue(subtractNums.substract(17,0) == 17);
    }

    @Test
    public void SixtyTwoMinusMinusThree() {
        Numbers subtractNums = new Numbers();
        assertEquals(59, subtractNums.substract(62,3));
        assertNotEquals(65, subtractNums.substract(62,3));
        assertTrue(subtractNums.substract(62,3) == 59);
    }


    //* Division Tests
    @Test
    public void ThreeDivideByOne() {
        Numbers divideNums = new Numbers();
        assertEquals(3, divideNums.divide(3,1));
        assertNotEquals(1, divideNums.divide(3,1));
        assertTrue(divideNums.divide(3,1) == 3);
    }

    @Test
    public void FortyEightDivideBySix() {
        Numbers divideNums = new Numbers();
        assertEquals(8.0f, divideNums.divide(48.0f,6.0f));
        assertNotEquals(12.0f, divideNums.divide(48.0f,6.0f));
        assertTrue(divideNums.divide(48.0f,6.0f) == 8.0f);
    }

    @Test
    public void NineDivideByZero() {
        Numbers divideNums = new Numbers();
        assertThrows(IllegalArgumentException.class, () -> {
            divideNums.divide(9,0);
        });
    }

    @Test
    public void EightyFourDivideByTwelve() {
        Numbers divideNums = new Numbers();
        assertEquals(7, divideNums.divide(84,12));
        assertNotEquals(6, divideNums.divide(84,12));
        assertTrue(divideNums.divide(84,12) == 7);
    }
}
