package ru.mirea.lab17.example;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Course model = retriveCourseFromDatabase();
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);

        controller.updateView();

        controller.setCourseName("Python");
        System.out.println("After updating, Course Details are as follows");

        controller.updateView();
    }

    private static Course retriveCourseFromDatabase() {
        Course course = new Course();
        course.setCourseName("Java");
        course.setCourseId("01");
        course.setCourseCategory("Programming");
        return course;
    }
}
