package CT417;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int id;
    private String userName;
    private ArrayList<CourseProgramme> listOfCourses;
    private ArrayList<Module> listOfModules;

    public Student(String name, int age, LocalDate dateOfBirth, int id){
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.listOfCourses = new ArrayList<>();
        this.listOfModules = new ArrayList<>();
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
        return listOfCourses;
    }

    public void setCourse(ArrayList<CourseProgramme> courses) {
        this.listOfCourses = courses;
    }

    public ArrayList<Module> getModulesRegisteredFor() {
        return listOfModules;
    }

    public void setModulesRegisteredFor(ArrayList<Module> module) {
        this.listOfModules = module;
    }

    public void addCourse(CourseProgramme course) {
        listOfCourses.add(course);
    }

    public void addModule(Module module) {
        listOfModules.add(module);
    }

    @Override
    public String toString()
    {

        String course = "";
        if (this.listOfCourses.size() > 0) {
            for (CourseProgramme c : listOfCourses) {
                course = c.getCourseName();
            }
        }

        String module = "";
        if (this.listOfModules.size() > 0) {
            for (Module m : listOfModules) {
                module += "[" + m.getModuleId() + "] " + m.getModuleName() + "\n\t\t\t\t";
            }
        }
        String str = "";

            str+= "Student:\t\t" + getName();
            str+= "\nID:\t\t\t\t" + getId();
            str+= "\nUsername:\t\t" + getUserName();
            str+= "\nDate of Birth:\t" + getDateOfBirth();
            str+= "\nAge:\t\t\t" + getAge();
            str+= "\nCourses:\t\t" + course;
            str+= "\nModules:\t\t" + module;

            return str;
    }
}
