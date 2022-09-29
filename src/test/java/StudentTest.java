import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
        List<String> courses = Arrays.asList("CSIT", "ENG", "MA");
        List<String> modules = Arrays.asList("Maths", "Physics", "Fields and Applications");
        public String name = "Liam";
        public int age = 21;
        public LocalDate dateOfBirth = LocalDate.parse("2001-08-03");
        public int id = 19388151;
        Student student = new Student(name, age, dateOfBirth, id);
    @Test
    void getUserName() {
        String username = student.getUserName();
        assertEquals("Liam21", username);
    }

    @Test
    void getName() {
        assertEquals(name, student.getName());
    }

    @Test
    void getDateOfBirth() {
        assertEquals(dateOfBirth, student.getDateOfBirth());
    }

    @Test
    void getAge() {
        assertEquals(age, student.getAge());
    }

    @Test
    void getId() {
        assertEquals(id, student.getId());

    }

    @Test
    void getCourses() {
    }

    @Test
    void getModules() {
    }

}