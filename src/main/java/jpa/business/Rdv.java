package jpa.business;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Rdv implements Serializable {

    private Long id;

    private String title;

    //    @Column(length = 80)
//    private String duration;

    private Long duration;

    private Prof prof;

    private Student student;

    public Rdv(String title, Long duration) {
        this.title = title;
        this.duration = duration;
    }

    public Rdv() {

    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @ManyToOne
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }



}

