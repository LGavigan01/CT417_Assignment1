import CT417.CourseProgramme;
import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;

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
    }

    @Test
    void getListOfStudents() {
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