package com.zyh.mybatis.pojo;

public class Score {
    private Integer sid;
    private Integer cid;
    private Integer score;

    private Student student;
    private Course course;

    @Override
    public String toString() {
        return "Score{" +
                "sid=" + sid +
                ", cid=" + cid +
                ", score=" + score +
                ", student=" + student +
                ", course=" + course +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
