import java.util.*;

public class StudentCourse {
    private Map<Integer, List<Course>> courseMap;

    public StudentCourse() {
        courseMap = new HashMap<>();
    }

    public void addCourse(int semester, String courseName, int marks) {
        courseMap.computeIfAbsent(semester, k -> new ArrayList<>())
                 .add(new Course(courseName, marks));
    }

    public void displayCourses() {
        for (int semester : courseMap.keySet()) {
            System.out.println("Semester " + semester + ":");
            for (Course c : courseMap.get(semester)) {
                System.out.println("  " + c.courseName + " - Marks: " + c.marks);
            }
        }
    }

    private static class Course {
        String courseName;
        int marks;

        Course(String courseName, int marks) {
            this.courseName = courseName;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        StudentCourse sc = new StudentCourse();
        sc.addCourse(1, "Math", 80);
        sc.addCourse(1, "English", 75);
        sc.addCourse(2, "Science", 90);
        sc.displayCourses();
    }
}
