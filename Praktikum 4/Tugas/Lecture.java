import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Employee ID: " + employeeID);
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
        course.setLecture(this);
    }

    public void viewTaughtCourses() {
        System.out.println("Courses taught by " + getName() + ":");
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
