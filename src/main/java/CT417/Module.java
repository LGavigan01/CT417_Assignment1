package CT417;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleId;
    private ArrayList<Student> listOfStudents;
    private ArrayList<CourseProgramme> listOfCourses;
    private Lecturer lecturerResponsible;

    public Module(String moduleName, String moduleId, Lecturer lecturerResponsible){
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.lecturerResponsible = lecturerResponsible;
        this.listOfStudents = new ArrayList<>();
        this.listOfCourses = new ArrayList<>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getModuleId() {
        return moduleId;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void addStudent(Student student)
    {
        listOfStudents.add(student);
    }

    public ArrayList<CourseProgramme> getListOfCourses() {
        return listOfCourses;
    }

    public void setCourse(ArrayList<CourseProgramme> courses) {
        this.listOfCourses = courses;
    }

    public void addCourse(CourseProgramme course)
    {
        listOfCourses.add(course);
    }

    public Lecturer getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public void setListOfStudent(ArrayList<Student> student) {
        this.listOfStudents = student;
    }

    public void setLecturerResponsible(Lecturer lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }

    @Override
    public String toString()
    {
        String student = "";
        if (this.listOfStudents.size() > 0) {
            student += "\t\t\t\tNAME\tID\n";
            for (Student s : listOfStudents) {
                    student += "Student " + (listOfStudents.indexOf(s) + 1) + ":\t\t" + s.getName() + "\t" + s.getId() + "\n";
            }
        }
        
        String str = "";
            str+="-------------------------------------------------------------";
            str += "\nModule:\t\t\t" + "[" + getModuleId() + "] " + getModuleName();
            str += "\nLecturer Details:\n" + getLecturerResponsible().toString();
            str += "Students Registered:\n" + student;
            str+="-------------------------------------------------------------";
            return str;
    }

}
