package gks.lcf.com.entity;

import java.util.Date;

public class News {
    private Integer nId;

    private String nName;

    private String nProposer;

    private Date nReleaseTime;

    private String nContent;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName == null ? null : nName.trim();
    }

    public String getnProposer() {
        return nProposer;
    }

    public void setnProposer(String nProposer) {
        this.nProposer = nProposer == null ? null : nProposer.trim();
    }

    public Date getnReleaseTime() {
        return nReleaseTime;
    }

    public void setnReleaseTime(Date nReleaseTime) {
        this.nReleaseTime = nReleaseTime;
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent == null ? null : nContent.trim();
    }
}