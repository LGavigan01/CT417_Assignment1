import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int id;
    private String userName;
    private ArrayList courses;
    private ArrayList modules;

    public Student(String name, int age, LocalDate dateOfBirth, int id, String userName, ArrayList courses, ArrayList modules){ //Still need to add courses and modules
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.courses = courses;
        this.modules = modules;
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

    public ArrayList getCourses() {
        return courses;
    }

    public void setCourses(ArrayList courses) {
        this.courses = courses;
    }

    public ArrayList getModules() {
        return modules;
    }

    public void setModules(ArrayList modules) {
        this.modules = modules;
    }

    public String getUserName() {
        return userName + age;
    }
}
