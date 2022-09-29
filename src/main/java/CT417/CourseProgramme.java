package CT417;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgramme {

    public String courseName;
    public ArrayList<String> listOfModules;
    public ArrayList<String> listOfStudents;
    public DateTime startDate;
    public DateTime endDate;

    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.listOfModules = new ArrayList<>();
        this.listOfStudents = new ArrayList<>();
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

    public DateTime getStartDate() {
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
