package CT417;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int id;
    private String userName;
    private ArrayList<CourseProgramme> courseList;
    private ArrayList<Module> moduleList;

    public Student(String name, int age, LocalDate dateOfBirth, int id){
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.courseList = new ArrayList<>();
        this.moduleList = new ArrayList<>();
        this.userName = name + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<CourseProgramme> getCourse() {
        return courseList;
    }

    public void setCourseRegisteredFor(ArrayList<CourseProgramme> courses) {
        this.courseList = courses;
    }

    public ArrayList<Module> getModulesRegisteredFor() {
        return moduleList;
    }

    public void setModulesRegisteredFor(ArrayList<Module> module) {
        this.moduleList = module;
    }

    public void addCourse(CourseProgramme course) {
        ArrayList<CourseProgramme> addCourseProgramme = courseList;
        addCourseProgramme.add(course);
        setCourseRegisteredFor(addCourseProgramme);
    }

    public void addModule(Module module) {
        ArrayList<Module> addAModule = moduleList;
        addAModule.add(module);
        setModulesRegisteredFor(addAModule);
    }

    @Override
    public String toString()
    {
        return "Name:\t" + getName() + "\tAge:\t" + getAge() + "\tUsername:\t" + getUserName();
    }
}
