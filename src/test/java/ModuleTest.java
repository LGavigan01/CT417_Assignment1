import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    public String moduleName = "Software Engineering";
    public String moduleId = "CT417";
    public String lecturerResponsible = "Liam Gavigan";

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