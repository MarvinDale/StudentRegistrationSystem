/*
    Name: Marvin Dale
    ID:   18362583
 */
import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private DateTime startDate;
    private DateTime endDate;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Course(String courseName, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", modules=" + modules +
                ", students=" + students +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
