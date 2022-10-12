import CT417.Lecturer;

import CT417.Module;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    public String name = "Liam";
    public LocalDate dateOfBirth = LocalDate.parse("2001-08-03");
    public int id = 19388151;
    Lecturer lecturer = new Lecturer(name, dateOfBirth, id);

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
        assertEquals(21, lecturer.getAge());
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
        Module module = new Module("Software Engineering", "CT417", null);
        lecturer.addModuleTaught(module);
        ArrayList<Module> modules = lecturer.getModule();
        assertEquals(1, modules.size());
    }
}