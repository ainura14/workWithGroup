package model;

public class Course {
    private Long courseId;
    private String courseName;
    private String image;
    private Long groupId;

    public Course() {
    }
    public Course(Long courseId, String courseName, String image, Long groupId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.image = image;
        this.groupId = groupId;

    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Course{" +
               "courseId=" + courseId +
               ", courseName='" + courseName + '\'' +
               ", image='" + image + '\'' +
               ", groupId=" + groupId +
               '}';
    }
}
