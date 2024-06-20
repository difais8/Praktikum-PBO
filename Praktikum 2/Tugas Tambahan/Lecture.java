import java.util.List;
import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + employeeID);
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
        course.setLecture(this);
    }

    public void viewTaughtCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
