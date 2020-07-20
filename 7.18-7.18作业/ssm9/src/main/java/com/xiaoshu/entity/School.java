package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "stu_school")
public class School implements Serializable {
    @Id
    @Column(name = "stu_id")
    private Integer stuId;

    private String student;

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
     * @return student
     */
    public String getStudent() {
        return student;
    }

    /**
     * @param student
     */
    public void setStudent(String student) {
        this.student = student == null ? null : student.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuId=").append(stuId);
        sb.append(", student=").append(student);
        sb.append("]");
        return sb.toString();
    }
}