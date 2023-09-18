package jpa.business;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Prof extends User implements Serializable {

    private Long id;

    private String department;

    private List<Rdv> rdvs;

    public Prof(String name, String department) {
        super(name);
        this.department = department;
    }

    public Prof() {

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @OneToMany(mappedBy = "prof", cascade = CascadeType.PERSIST)
    public List<Rdv> getRdvs() {
        return this.rdvs;
    }

    public void setRdvs(List<Rdv> rdvs) {
        this.rdvs = rdvs;
    }


}

