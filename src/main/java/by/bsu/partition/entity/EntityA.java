package by.bsu.partition.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@IdClass(PartitionPK.class)
@Table(name = "partition_a")
public class EntityA implements Serializable {

    @Id
    private String guid;

    @Id
    private Boolean actual;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "parentEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<EntityB> childEntityB;

    public String getGuid() {
        return guid;
    }

    public Boolean getActual() {
        return actual;
    }

    public String getName() {
        return name;
    }

    public List<EntityB> getChildEntityB() {
        return childEntityB;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChildEntityB(List<EntityB> childEntityB) {
        this.childEntityB = childEntityB;
    }
}
