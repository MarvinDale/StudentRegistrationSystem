/*
    Name: Marvin Dale
    ID:   18362583
 */

import org.joda.time.DateTime;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private List<Course> registeredCourses;
    private List<Module> registeredModules;

    public Student() {
    }

    public Student (String name, int age, DateTime DOB, int ID) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
    }

    public Student(String name, int age, DateTime DOB, int ID, List<Course> registeredCourses, List<Module> registeredModules) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.registeredCourses = registeredCourses;
        this.registeredModules = registeredModules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return name + age;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    public List<Module> getRegisteredModules() {
        return registeredModules;
    }

    public void setRegisteredModules(List<Module> registeredModules) {
        this.registeredModules = registeredModules;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nname='" + name + '\'' +
                ", age=" + age +
                ", DOB=" + DOB +
                ", ID="  + ID +
                '}';
    }
}
