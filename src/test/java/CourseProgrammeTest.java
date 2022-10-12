import CT417.CourseProgramme;
import CT417.Module;
import CT417.Student;
import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseProgrammeTest {

    public String courseName = "CS & IT";
    public DateTime startDate = DateTime.parse("2022-09-01");
    public DateTime finishDate = DateTime.parse("2023-05-01");
    CourseProgramme course = new CourseProgramme(courseName, startDate, finishDate);

    @Test
    void getCourseName() {
        assertEquals(courseName, course.getCourseName());
    }

    @Test
    void getListOfModules() {
        Module module = new Module("Software Engineering", "CT417", null);
        course.addModule(module);
        ArrayList<Module> modules = course.getListOfModules();
        assertEquals(1, modules.size());
    }

    @Test
    void getListOfStudents() {
        Student student = new Student("Liam", LocalDate.parse("2001-08-03"), 1932);
        course.addStudent(student);
        ArrayList<Student> students = course.getListOfStudents();
        assertEquals(1, students.size());
    }

    @Test
    void getStartDate() {
        assertEquals(startDate, course.getStartDate());
    }

    @Test
    void getEndDate() {
        assertEquals(startDate, course.getStartDate());
    }
}