package CT417;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleId;
    private ArrayList<Student> student;
    private ArrayList<CourseProgramme> course;
    private String lecturerResponsible;

    public Module(String moduleName, String moduleId, String lecturerResponsible){
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.student = new ArrayList<>();
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
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }
    public void addStudent(Student s1) {
        ArrayList<Student> addAStudent = student;
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

    public String getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setLecturerResponsible(String lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }


}
