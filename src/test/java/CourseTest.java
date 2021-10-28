/*
    Name: Marvin Dale
    ID:   18362583
 */

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {
    private final String courseName = "Engineering";
    private final DateTime startDate = DateTime.now();
    private final DateTime endDate = DateTime.now();

    private static final Module module = new Module("Maths");
    private static ArrayList<Module> registeredModules = new ArrayList<>();

    Student student = new Student("Marvin", 21, DateTime.now(), 1234);
    private ArrayList<Student> registeredStudents = new ArrayList<>();

    private final Course course = new Course(courseName, startDate, endDate);

    @Test
    void getCourseName() {
        assertEquals(courseName, course.getCourseName());
    }

    @Test
    void getCourseStart() {
        assertEquals(startDate, course.getStartDate());
    }

    @Test
    void getCourseEnd() {
        assertEquals(endDate, course.getEndDate());
    }

    @Test
    void setAndGetRegisteredModules() {
        registeredModules.add(module);
        course.setModules(registeredModules);
        assertEquals(registeredModules, course.getModules());
    }

    @Test
    void setAndGetRegisteredStudents() {
        registeredStudents.add(student);
        course.setStudents(registeredStudents);
        assertEquals(registeredStudents, course.getStudents());
    }
}
