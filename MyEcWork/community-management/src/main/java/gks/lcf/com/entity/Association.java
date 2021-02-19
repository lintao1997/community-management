package gks.lcf.com.entity;

import java.util.Date;

public class Association {
    private Integer aId;

    private String aName;

    private String aImage;

    private Date aRegisterData;

    private String aFounder;

    private Integer aStatus;

    private Integer aNumbers;

    private String aComments;

    private Double aMoney;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaImage() {
        return aImage;
    }

    public void setaImage(String aImage) {
        this.aImage = aImage == null ? null : aImage.trim();
    }

    public Date getaRegisterData() {
        return aRegisterData;
    }

    public void setaRegisterData(Date aRegisterData) {
        this.aRegisterData = aRegisterData;
    }

    public String getaFounder() {
        return aFounder;
    }

    public void setaFounder(String aFounder) {
        this.aFounder = aFounder == null ? null : aFounder.trim();
    }

    public Integer getaStatus() {
        return aStatus;
    }

    public void setaStatus(Integer aStatus) {
        this.aStatus = aStatus;
    }

    public Integer getaNumbers() {
        return aNumbers;
    }

    public void setaNumbers(Integer aNumbers) {
        this.aNumbers = aNumbers;
    }

    public String getaComments() {
        return aComments;
    }

    public void setaComments(String aComments) {
        this.aComments = aComments == null ? null : aComments.trim();
    }

    public Double getaMoney() {
        return aMoney;
    }

    public void setaMoney(Double aMoney) {
        this.aMoney = aMoney;
    }
}