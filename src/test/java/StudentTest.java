import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
        List<String> courses = Arrays.asList("CSIT", "ENG", "MA");
        List<String> modules = Arrays.asList("Maths", "Physics", "Fields and Applications");

        Student student = new Student("Liam", 21, LocalDate.parse("2019-08-16"), 19388151, courses, modules);
        private final String expected = student.getName() + student.getAge();
        String actual = student.getUserName();
    @Test
    void getUserName() {
        assertEquals(expected, actual);
    }
}