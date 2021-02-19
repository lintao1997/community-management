package gks.lcf.com.entity;

public class Manage {
    private Integer mId;

    private String mUsername;

    private String mPassword;

    private String mRealname;

    private String mPhone;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername == null ? null : mUsername.trim();
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword == null ? null : mPassword.trim();
    }

    public String getmRealname() {
        return mRealname;
    }

    public void setmRealname(String mRealname) {
        this.mRealname = mRealname == null ? null : mRealname.trim();
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone == null ? null : mPhone.trim();
    }
}