package ru.mirea.lab17.example;

public class CourseController {
    private Course model;
    private CourseView view;

    public CourseController(Course model, CourseView view) {
        this.model = model;
        this.view = view;
    }

    public void setCourseName(String name) {
        model.setCourseName(name);
    }

    public String getCourseName() {
        return model.getName();
    }

    public String getCourseId() {
        return model.getId();
    }

    public void setCourseId(String courseId) {
        model.setCourseId(courseId);
    }

    public String getCourseCategory() {
        return model.getCategory();
    }

    public void setCourseCategory(String courseCategory) {
        model.setCourseCategory(courseCategory);
    }

    public void updateView() {
        view.printCourseDetails(model.getName(),
                model.getId(),
                model.getCategory());
    }
}
