package model;

public class Lesson {
    private Long id;
    private String lessonName;
    private Long courseID;

    public Lesson() {

    }

    public Lesson(Long id, String lessonName, Long courseID) {
        this.id = id;
        this.lessonName = lessonName;
        this.courseID = courseID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "Lesson{" +
               "id=" + id +
               ", lessonName='" + lessonName + '\'' +
               ", courseID=" + courseID +
               '}';
    }
}
