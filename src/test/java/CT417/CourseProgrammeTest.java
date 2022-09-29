package CT417;

import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseProgrammeTest {

    public String courseName = "CS & IT";
    public DateTime startDate = new DateTime(2021, 9, 10, 12, 30);
    public DateTime finishDate = new DateTime(2022, 5, 1, 12, 30);
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