import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleId;
    private ArrayList<String> listOfStudents;
    private ArrayList<String> associatedCourses;
    private String lecturerResponsible;

    public Module(String moduleName, String moduleId, ArrayList<String> listOfStudents, ArrayList<String> associatedCourses, String lecturerResponsible){
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.listOfStudents = listOfStudents;
        this.associatedCourses = associatedCourses;
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

    public ArrayList<String> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<String> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public ArrayList<String> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<String> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public String getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setLecturerResponsible(String lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }
}
