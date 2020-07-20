package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "tb_student")
public class Student implements Serializable {
    @Id
    @Column(name = "stu_id")
    private Integer stuId;

    @Column(name = "stu_name")
    private String stuName;

    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "stu_birthday")
    private Date stuBirthday;

    @Column(name = "stu_age")
    private Integer stuAge;

    @Column(name = "stu_gender")
    private String stuGender;

    @Column(name = "stu_sid")
    private Integer stuSid;

    private static final long serialVersionUID = 1L;

    /**
     * @return stu_id
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * @param stuId
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * @return stu_name
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * @param stuName
     */
    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    /**
     * @return stu_birthday
     */
   

    /**
     * @param stuBirthday
     */
    

    /**
     * @return stu_age
     */
    public Integer getStuAge() {
        return stuAge;
    }

    public Date getStuBirthday() {
		return stuBirthday;
	}

	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}

	/**
     * @param stuAge
     */
    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    /**
     * @return stu_gender
     */
    public String getStuGender() {
        return stuGender;
    }

    /**
     * @param stuGender
     */
    public void setStuGender(String stuGender) {
        this.stuGender = stuGender == null ? null : stuGender.trim();
    }

    /**
     * @return stu_sid
     */
    public Integer getStuSid() {
        return stuSid;
    }

    /**
     * @param stuSid
     */
    public void setStuSid(Integer stuSid) {
        this.stuSid = stuSid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuId=").append(stuId);
        sb.append(", stuName=").append(stuName);
        sb.append(", stuBirthday=").append(stuBirthday);
        sb.append(", stuAge=").append(stuAge);
        sb.append(", stuGender=").append(stuGender);
        sb.append(", stuSid=").append(stuSid);
        sb.append("]");
        return sb.toString();
    }
}