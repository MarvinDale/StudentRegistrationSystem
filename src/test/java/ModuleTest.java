import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
    Name: Marvin Dale
    ID:   18362583
 */
public class ModuleTest {
    private final String moduleName = "Maths";
    private final String id = "MA123";

    Student student = new Student("Marvin", 21, DateTime.now(), 1234);
    private ArrayList<Student> registeredStudents = new ArrayList<>();

    Course course = new Course("Engineering");
    private ArrayList<Course> registeredCourses = new ArrayList<>();

    private final Module module = new Module(moduleName, id);

    @Test
    void getModuleName() {
        assertEquals(moduleName, module.getModuleName());
    }

    @Test
    void getModuleId() {
        assertEquals(id, module.getId());
    }

    @Test
    void setAndGetRegisteredCourses() {
        registeredCourses.add(course);
        module.setCourses(registeredCourses);
        assertEquals(registeredCourses, module.getCourses());
    }

    @Test
    void setAndGetRegisteredStudents() {
        registeredStudents.add(student);
        module.setStudents(registeredStudents);
        assertEquals(registeredStudents, module.getStudents());
    }
}
