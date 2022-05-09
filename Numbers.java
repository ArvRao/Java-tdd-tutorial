import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.Test;

public class Numbers {
    // single unit test
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        if ((num1 ==0 || num2 == 0)) {
            return 0;
        }
        return num1 * num2;
    }

    public float divide(float num1, float num2) {
        if(num2 == 0) {
            throw new ArithmeticException("Divide by zero not possible");
        }
        return num1 / num2;
    }

    @Test
    public void testAdd(){
        assertEquals(4, add(2,2));
        assertEquals(7, add(-1,8));
        assertNotEquals(12, add(6, 8));
        // assertTrue(booleanSupplier);
    }

    @Test
    public void testSub() {
        assertEquals(5, substract(10, 5));
    }

    @Test
    public void testMult() {
        assertEquals(100.0, multiply(50.0, 2.0));
    }

    @Test
    public void testDivide() {
        assertEquals(3.1f, divide(6.2f, 2.0f));
    }
}
