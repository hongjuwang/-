package com.whj.relation.model;


import lombok.Data;

/**
 * @Author wanghj
 * @Description: com.whj.relation.model
 * @Description TODO
 * @Date: 2019/9/28
 **/
@Data
public class Student {
    String sno;
    String sname;
    String ssex;
    String sinfo;
    String dno;
    String dorm;
    String clno;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSinfo() {
        return sinfo;
    }

    public void setSinfo(String sinfo) {
        this.sinfo = sinfo;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    public String getClno() {
        return clno;
    }

    public void setClno(String clno) {
        this.clno = clno;
    }
}

