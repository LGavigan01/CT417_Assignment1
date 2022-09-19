import org.joda.time.DateTime;

import java.time.LocalDate;
import java.util.ArrayList;

public class CourseProgramme {

    private String courseName;
    private ArrayList<String> listOfModules;
    private ArrayList<String> listOfStudents;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String courseName, ArrayList<String> listOfModules, ArrayList<String> listOfStudents, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.listOfModules = listOfModules;
        this.listOfStudents = listOfStudents;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<String> getListOfModules() {
        return listOfModules;
    }

    public void setListOfModules(ArrayList<String> listOfModules) {
        this.listOfModules = listOfModules;
    }

    public ArrayList<String> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<String> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public LocalDateTimeDate getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
