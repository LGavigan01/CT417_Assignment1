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

    public ArrayList<Module> getListOfModules() {
        return listOfModules;
    }

    public void setListOfModules(ArrayList<Module> listOfModules) {
        this.listOfModules = listOfModules;
    }

    public void setStudent(ArrayList<Student> student) {
        this.listOfStudents = student;
    }

    public void addStudent(Student s1) {
        ArrayList<Student> addAStudent = listOfStudents;
        addAStudent.add(s1);
        setStudent(addAStudent);
    }

    public ArrayList<Student> getStudent() {
        return listOfStudents;
    }

    public void setModule(ArrayList<Module> module) {
        this.listOfModules = module;
    }

    public void addModule(Module module) {
        ArrayList<Module> addAModule = listOfModules;
        addAModule.add(module);
        setModule(addAModule);
    }
    public ArrayList<Module> getModule() {
        return listOfModules;
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

    @Override
    public String toString()
    {
        String str = "\n\nCourse Name: \t" + getCourseName() + "\n------------------------------------------------\t";

        if (this.listOfModules.size() > 0)
        {
            for (Module module : this.listOfModules)
            {
                str += module.toString();
            }
            str += "\n\n\n"; // This leaves a reasonable gap between each course, making for easier reading in console
        }

        return str;
    }
}
