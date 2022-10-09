package CT417;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lecturer{

    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int id;
    private String userName;
    private ArrayList<Module> modulesTaught;

    public Lecturer(String name, int age, LocalDate dateOfBirth, int id){ //Still need to add modules taught
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.modulesTaught = new ArrayList<>();
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

    public ArrayList<Module> getModule() {
        return modulesTaught;
    }

    public void setModulesTaught(ArrayList<Module> modules) {
        this.modulesTaught =  modules;
    }

    public void addModule(Module module) {
        ArrayList<Module> addAModule = modulesTaught;
        addAModule.add(module);
        setModulesTaught(addAModule);
    }

    @Override
    public String toString()
    {
        String str = "\nLecturer Details:";
        str += "\nName:\t" + getName() + "\tAge:\t" + getAge() + "\tUsername:\t" + getUserName();

        return str;
    }
}

