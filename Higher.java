import static org.junit.Assert.*;
import org.junit.Test;

public class Higher {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;

        int c = higher(a,b);
        System.out.println("The higher of " + a + " and " + b + " is " + c);
    }

    /*
    takes 2 parameters and returns the higher integer
    */

    public static int higher(int x, int y) {
        if (x<y) {
            return x;
        } else {
            return y;
        }
    }

    @Test
    public void testHigher() {
        assertEquals(25, higher(25, 25));
        assertEquals(1, higher(8, 1));
    }
}
