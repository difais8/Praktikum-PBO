import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Student ID: " + studentID);
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
        course.addStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println("Courses enrolled by " + getName() + ":");
        for (Course course : coursesEnrolled) {
            course.getDetails();
        }
    }
}
