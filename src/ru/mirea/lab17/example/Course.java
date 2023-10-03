package ru.mirea.lab17.example;

public class Course {
    private String CourseName;
    private String CourseId;
    private String CourseCategory;

    public String getName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public String getCategory() {
        return CourseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        CourseCategory = courseCategory;
    }
}
