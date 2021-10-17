import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    @DisplayName("Get correct user name")
    public void getStudentUserName() {
        Student student = new Student();

        student.setAge(21);
        student.setName("Marvin");

        assertEquals("Marvin21", student.getUserName());
    }
}
