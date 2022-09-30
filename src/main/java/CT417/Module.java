package CT417;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleId;
    private ArrayList<Student> listOfStudents;
    private ArrayList<CourseProgramme> course;
    private Lecturer lecturerResponsible;

    public Module(String moduleName, String moduleId, Lecturer lecturerResponsible){
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.listOfStudents = new ArrayList<>();
        this.course = new ArrayList<>();
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
    public void addStudent(Student s1) {
        ArrayList<Student> addAStudent = listOfStudents;
        addAStudent.add(s1);
        setStudent(addAStudent);
    }
    public ArrayList<CourseProgramme> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<CourseProgramme> courses) {
        this.course = courses;
    }

    public void addCourse(CourseProgramme c) {
        ArrayList<CourseProgramme> addCourseProgramme = course;
        addCourseProgramme.add(c);
        setCourse(addCourseProgramme);
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
        String str = "\n------------------------------------------------\nModule Name:\t" + this.moduleName + "\nModule ID:  \t" + this.moduleId + lecturerResponsible.toString();

        if (this.listOfStudents.size() > 0)
        {
            str += "\nStudents:";
            for (Student student : this.listOfStudents)
            {
                str += "\n" + student.toString();
            }
        }

        return str;
    }

}
