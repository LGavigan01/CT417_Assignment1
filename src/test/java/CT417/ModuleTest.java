package CT417;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    public String moduleName = "Software Engineering";
    public String moduleId = "CT417";
    public Lecturer lecturerResponsible = new Lecturer("Liam Gavigan", 42, LocalDate.parse("1991-08-03"), 7682);

    Module module = new Module(moduleName, moduleId, lecturerResponsible);

    @Test
    void getModuleName() {
        assertEquals(moduleName, module.getModuleName());
    }

    @Test
    void getModuleId() {
        assertEquals(moduleId, module.getModuleId());

    }

    @Test
    void getListOfStudents() {
    }

    @Test
    void getAssociatedCourses() {
    }

    @Test
    void getLecturerResponsible() {
    }
}