package jpa.business;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Prof extends User implements Serializable {

//    @SerializedName("userId")
    private Long id;

    private String department;

    @Expose(serialize = false, deserialize = false) // Exclude from serialization
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

