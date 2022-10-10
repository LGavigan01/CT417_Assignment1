package CT417;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {

    public String courseName;
    public ArrayList<Module> listOfModules;
    public ArrayList<Student> listOfStudents;
    public DateTime startDate;
    public DateTime endDate;

    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfModules = new ArrayList<>();
        this.listOfStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Module> getListOfModules() {
        return listOfModules;
    }

    public void addModule(Module module) {
        listOfModules.add(module);
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setListOfModules(ArrayList<Module> listOfModules) {
        this.listOfModules = listOfModules;
    }

    public void setListOfStudents(ArrayList<Student> student) {
        this.listOfStudents = student;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString()
    {
        String str = "";
        String module = "";
        if (this.listOfModules.size() > 0) {
            module += "\n\t\t\t\tID\t\tNAME\n";
            for (Module m : listOfModules) {
                module += "Module " + (listOfModules.indexOf(m) + 1) + ":\t\t" + m.getModuleId() + "\t" + m.getModuleName() + "\n";
            }
        }

            str+= "Course Programme:\t" + getCourseName();
            str+="\nStart date:\t\t\t" + startDate.toLocalDate();
            str+="\nEnd date:\t\t\t" + endDate.toLocalDate();
            str+="\nModules Associated:\t\t\t" + module;
        return str;
    }
}