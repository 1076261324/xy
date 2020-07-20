package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_school")
public class School implements Serializable {
    @Id
    @Column(name = "stu_sid")
    private Integer stuSid;

    @Column(name = "sch_sname")
    private String schSname;

    private static final long serialVersionUID = 1L;

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
     * @return sch_sname
     */
    public String getSchSname() {
        return schSname;
    }

    /**
     * @param schSname
     */
    public void setSchSname(String schSname) {
        this.schSname = schSname == null ? null : schSname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuSid=").append(stuSid);
        sb.append(", schSname=").append(schSname);
        sb.append("]");
        return sb.toString();
    }
}