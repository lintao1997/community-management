package gks.lcf.com.entity;

import java.util.Date;

public class Activity {
    private Integer activityId;

    private String activityName;

    private String activityImage;

    private Date activityStarttime;

    private Date activityEndtime;

    private String activityPropose;

    private String activityAssociation;

    private Integer activityStatus;

    private String activityContent;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getActivityImage() {
        return activityImage;
    }

    public void setActivityImage(String activityImage) {
        this.activityImage = activityImage == null ? null : activityImage.trim();
    }

    public Date getActivityStarttime() {
        return activityStarttime;
    }

    public void setActivityStarttime(Date activityStarttime) {
        this.activityStarttime = activityStarttime;
    }

    public Date getActivityEndtime() {
        return activityEndtime;
    }

    public void setActivityEndtime(Date activityEndtime) {
        this.activityEndtime = activityEndtime;
    }

    public String getActivityPropose() {
        return activityPropose;
    }

    public void setActivityPropose(String activityPropose) {
        this.activityPropose = activityPropose == null ? null : activityPropose.trim();
    }

    public String getActivityAssociation() {
        return activityAssociation;
    }

    public void setActivityAssociation(String activityAssociation) {
        this.activityAssociation = activityAssociation == null ? null : activityAssociation.trim();
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }
}