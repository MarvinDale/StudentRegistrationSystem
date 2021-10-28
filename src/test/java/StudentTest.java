/*
    Name: Marvin Dale
    ID:   18362583
 */
import org.joda.time.DateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private final String name = "Marvin";
    private final int age = 21;
    private final DateTime DOB = DateTime.now();
    private final int ID = 1234;

    private static final Course course = new Course("Engineering");
    private static ArrayList<Course> registeredCourses = new ArrayList<>();

    private static final Module module = new Module("Maths");
    private static ArrayList<Module> registeredModules = new ArrayList<>();


    private final Student student = new Student(name, age, DOB, ID);

    @Test
    @DisplayName("Get correct user name")
    public void getUserNameTest() {
        assertEquals("Marvin21", student.getUserName());
    }

    @Test
    void getNameTest() {
        assertEquals(name, student.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(age, student.getAge());
    }

    @Test
    void getDOBTest() {
        assertEquals(DOB, student.getDOB());
    }

    @Test
    void getIDTest() {
        assertEquals(ID, student.getID());
    }

    @Test
    void setAndGetRegisteredCourses() {
        registeredCourses.add(course);
        student.setRegisteredCourses(registeredCourses);
        assertEquals(registeredCourses, student.getRegisteredCourses());
    }

    @Test
    void setAndGetRegisteredModules() {
        registeredModules.add(module);
        student.setRegisteredModulesModule(registeredModules);
        assertEquals(registeredModules, student.getRegisteredModules());
    }
}
