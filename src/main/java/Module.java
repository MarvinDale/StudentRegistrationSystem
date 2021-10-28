/*
    Name: Marvin Dale
    ID:   18362583
 */
import java.util.ArrayList;

public class Module {
    private String moduleName;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String moduleName) {
        this.moduleName = moduleName;
    }

    public Module(String moduleName, String id) {
        this.moduleName = moduleName;
        this.id = id;
    }

    public Module(String moduleName, String id, ArrayList<Student> students, ArrayList<Course> courses) {
        this.moduleName = moduleName;
        this.id = id;
        this.students = students;
        this.courses = courses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Module{" +
                "\nmoduleName='" + moduleName + '\'' +
                ", \nid='" + id + '\'' +
                ", \nstudents=" + students +
                ", \ncourses=" + courses +
                '}';
    }
}
