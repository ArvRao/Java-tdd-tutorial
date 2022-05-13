import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

//TODO: Update nums
public class FullNames {
    public static void main(String[] args) {
        String firstName = "Arvind";
        String lastName = "Rao";

        String fullName = fullName(firstName, lastName);
        System.out.println("My full name of the person is " + fullName);
    }

    public static String fullName(String firstName, String lastName) {
        return firstName  + " " + lastName;
    }

    
    @Test
    public void testFullName() {
        assertEquals("Arvind Rao", fullName("Arvind", "Rao"));
        assertEquals("Tejas Kumar", fullName("Tejas", "Kumar"));
    }
}
