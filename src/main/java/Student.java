import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int id;
    private String userName;
    private ArrayList<String> courses;
    private ArrayList<String> modules;

    public Student(String name, int age, LocalDate dateOfBirth, int id){ //Still need to add courses and modules
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.courses = new ArrayList<>();;
        this.modules = new ArrayList<>();;
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

    public List getCourses() {
        return courses;
    }

    public ArrayList getModules() {
        return modules;
    }

    public String getUserName() {
        return userName;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void setModules(ArrayList<String> modules) {
        this.modules = modules;
    }
}
