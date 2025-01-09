package model;

import java.util.Date;

public class Group {
    private Long id;
    private String groupName;
    private Date date_of_birth;
    private String image;

    public Group() {
    }

    public Group(Long id, String groupName, Date date_of_birth, String image) {
        this.id = id;
        this.groupName = groupName;
        this.date_of_birth = date_of_birth;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", image='" + image + '\'' +
                '}';
    }
}
