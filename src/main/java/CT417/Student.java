package CT417;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int id;
    private String userName;
    private ArrayList<CourseProgramme> course;
    private ArrayList<Module> module;

    public Student(String name, int age, LocalDate dateOfBirth, int id){ //Still need to add courses and modules
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.course = new ArrayList<>();;
        this.module = new ArrayList<>();;
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
        return course;
    }

    public void setCourse(ArrayList<CourseProgramme> courses) {
        this.course = courses;
    }

    public ArrayList<Module> getModulesRegisteredFor() {
        return module;
    }

    public void setModulesRegisteredFor(ArrayList<Module> module) {
        this.module = module;
    }

    public void addCourse(CourseProgramme addCourse) {
        ArrayList<CourseProgramme> addCourseProgramme = course;
        addCourseProgramme.add(addCourse);
        setCourse(addCourseProgramme);
    }

    public void addModule(Module addModule) {
        ArrayList<Module> addAModule = module;
        addAModule.add(addModule);
        setModulesRegisteredFor(addAModule);
    }

    @Override
    public String toString()
    {
        return "Name:\t" + this.name + "\tAge:\t" + getAge() + "\tUsername:\t" + getUserName();
    }
}
