import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    public String name = "Liam";
    public int age = 21;
    public LocalDate dateOfBirth = LocalDate.parse("2001-08-03");
    public int id = 19388151;
    Lecturer lecturer = new Lecturer(name, age, dateOfBirth, id);

    @Test
    void getName() {
        assertEquals(name, lecturer.getName());
    }

    @Test
    void getDateOfBirth() {
        assertEquals(dateOfBirth, lecturer.getDateOfBirth());
    }

    @Test
    void getAge() {
        assertEquals(age, lecturer.getAge());
    }

    @Test
    void getId() {
        assertEquals(id, lecturer.getId());

    }

    @Test
    void getUserName() {
        String username = lecturer.getUserName();
        assertEquals("Liam21", username);
    }

    @Test
    void getModulesTaught() {
    }
}