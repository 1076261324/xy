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

    @Column(name = "stu_sname")
    private String stuSname;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "stu_birthday")
    private Date stuBirthday;

    @Column(name = "stu_age")
    private Integer stuAge;

    @Column(name = "stu_sid")
    private Integer stuSid;

    @Column(name = "stu_gender")
    private String stuGender;

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
     * @return stu_sname
     */
    public String getStuSname() {
        return stuSname;
    }

    /**
     * @param stuSname
     */
    public void setStuSname(String stuSname) {
        this.stuSname = stuSname == null ? null : stuSname.trim();
    }

    /**
     * @return stu_birthday
     */
    public Date getStuBirthday() {
        return stuBirthday;
    }

    /**
     * @param stuBirthday
     */
    public void setStuBirthday(Date stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    /**
     * @return stu_age
     */
    public Integer getStuAge() {
        return stuAge;
    }

    /**
     * @param stuAge
     */
    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
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

    /**
     * @return stu_gender
     */
  
    /**
     * @param stuGender
     */
   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuId=").append(stuId);
        sb.append(", stuSname=").append(stuSname);
        sb.append(", stuBirthday=").append(stuBirthday);
        sb.append(", stuAge=").append(stuAge);
        sb.append(", stuSid=").append(stuSid);
        sb.append(", stuGender=").append(stuGender);
        sb.append("]");
        return sb.toString();
    }

	public String getStuGender() {
		return stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}
}