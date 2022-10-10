package CT417;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Lecturer{

    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int id;
    private String userName;
    private ArrayList<Module> modulesTaught;

    public Lecturer(String name, LocalDate dateOfBirth, int id){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears(); //Handy method to calculate age from dateOfBirth
        this.modulesTaught = new ArrayList<>();
        this.userName = name + age;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<Module> getModule() {
        return modulesTaught;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModulesTaught(ArrayList<Module> modules) {
        this.modulesTaught =  modules;
    }

    public void addModuleTaught(Module module) {
        modulesTaught.add(module);
    }

    @Override
    public String toString() {
        String str = "";
        String module = "";
        if (this.modulesTaught.size() > 0) {
            for (Module m : modulesTaught) {
                module = m.getModuleId() + " " + m.getModuleName() + "\n";
            }
        }
            str += "Name:\t\t\t" + name;
            str += "\nID:\t\t\t\t" + getId();
            str += "\nUsername:\t\t" + getUserName();
            str += "\nDate of Birth:\t" + getDateOfBirth();
            str += "\nAge:\t\t\t" + getAge() + "\n";
            return str;
        }
}

