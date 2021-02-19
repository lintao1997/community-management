package gks.lcf.com.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class Stu {
    private Integer sId;
    private String sRealname;
    private String sUsername;
    private String sPassword;
    private Date sRegisterData;
    private String sSex;
    private String sCollege;
    private String sClass;
    private String sPhone;
    private String sImage;
    private Integer sAssociation;
   

}