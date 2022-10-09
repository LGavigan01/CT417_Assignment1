package CT417;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
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
    void getModulesRegisteredFor() {
        Module module = new Module("Software Engineering", "CT417", null);
        student.addModule(module);
        ArrayList<Module> modules = student.getModulesRegisteredFor();
        assertEquals(1, modules.size());
    }

}