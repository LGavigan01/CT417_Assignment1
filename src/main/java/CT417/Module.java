package CT417;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleId;
    private ArrayList<Student> listOfStudents;
    private ArrayList<CourseProgramme> courseList;
    private Lecturer lecturerResponsible;

    public Module(String moduleName, String moduleId, Lecturer lecturerResponsible){
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.listOfStudents = new ArrayList<>();
        this.courseList = new ArrayList<>();
        this.lecturerResponsible = lecturerResponsible;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public ArrayList<Student> getStudent() {
        return listOfStudents;
    }

    public void setStudent(ArrayList<Student> student) {
        this.listOfStudents = student;
    }
    public void addStudent(Student student) {
        ArrayList<Student> addAStudent = listOfStudents;
        addAStudent.add(student);
        setStudent(addAStudent);
    }
    public ArrayList<CourseProgramme> getCourse() {
        return courseList;
    }

    public void setCourse(ArrayList<CourseProgramme> courses) {
        this.courseList = courses;
    }

    public void addCourse(CourseProgramme courseProgramme) {
        ArrayList<CourseProgramme> addACourseProgramme = courseList;
        addACourseProgramme.add(courseProgramme);
        setCourse(addACourseProgramme);
    }

    public Lecturer getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setLecturerResponsible(Lecturer lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }

    // toString
    @Override
    public String toString()
    {
        String str = "\nModule Name:\t" + getModuleName() + "\nModule ID:  \t" + getModuleId() + getLecturerResponsible();

        if (this.listOfStudents.size() > 0)
        {
            str += "\nStudents:";
            for (Student student : this.listOfStudents)
            {
                str += "\n" + student.toString();
            }
            str += "\n------------------------------------------------";
        }

        return str;
    }

}
