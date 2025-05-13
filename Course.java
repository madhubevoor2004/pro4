import java.util.*;

class Course {
    String name;
    int marks;

    public Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student{
    String name;
    String program;
    int semester;
    List<Course> courses;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(String courseName, int marks) {
        courses.add(new Course(courseName, marks));
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Registered Courses:");
        for (Course c : courses) {
            System.out.println(" - " + c.name);
        }
    }

    public void displayLowScoringCourses() {
        System.out.println("Courses with marks < 40:");
        for (Course c : courses) {
            if (c.marks < 40) {
                System.out.println(" - " + c.name + ": " + c.marks);
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", "B.Tech CSE", 5);
        student.registerCourse("Math", 78);
        student.registerCourse("Physics", 35);
        student.registerCourse("Data Structures", 28);
        student.registerCourse("Java", 82);

        student.displayStudentInfo();
        student.displayLowScoringCourses();
    }
}
