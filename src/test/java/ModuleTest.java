import CT417.CourseProgramme;
import CT417.Lecturer;
import CT417.Module;
import CT417.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    public String moduleName = "Software Engineering";
    public String moduleId = "CT417";
    public Lecturer lecturerResponsible = new Lecturer("Liam Gavigan", LocalDate.parse("1991-08-03"), 7682);

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
        Student student = new Student("Liam", LocalDate.parse("2001-08-03"), 1932);
        module.addStudent(student);
        ArrayList<Student> students = module.getListOfStudents();
        assertEquals(1, students.size());
    }

    @Test
    void getAssociatedCourses() {
        CourseProgramme course = new CourseProgramme("Computer Science & Information Technology", DateTime.parse("2022-09-01"), DateTime.parse("2023-05-01"));;
        module.addCourse(course);
        ArrayList<CourseProgramme> courses = module.getListOfCourses();
        assertEquals(1, courses.size());
    }

    @Test
    void getLecturerResponsible() {
        Lecturer lecturer = new Lecturer("Mike", LocalDate.parse("1980-06-12"), 1243);
        module.setLecturerResponsible(lecturer);
        assertEquals(lecturer,module.getLecturerResponsible());
    }
}