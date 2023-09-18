package jpa.business;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Student extends User implements Serializable {

    private Long id;

    private String group;

    private List<Rdv> rdvs;

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    public Student() {

    }

    @Column(name = "team") // group is the reserved key word
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @OneToMany(mappedBy = "student", cascade = CascadeType.PERSIST)
    public List<Rdv> getRdvs() {
        return this.rdvs;
    }

    public void setRdvs(List<Rdv> rdvs) {
        this.rdvs = rdvs;
    }


}

