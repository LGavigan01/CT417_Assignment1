import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;
    private final String expectedUserName = student.getName() + student.getAge();

    @Test
    void getUserName() {
        String resultantUserName = student.getUserName();
        assertEquals(expectedUserName, resultantUserName);
    }
}