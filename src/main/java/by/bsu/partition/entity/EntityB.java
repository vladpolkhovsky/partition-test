package by.bsu.partition.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@IdClass(PartitionPK.class)
@Table(name = "partition_b")
public class EntityB implements Serializable {

    @Id
    private String guid;

    @Id
    private Boolean actual;

    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "p_actual", nullable = false)
    @JoinColumn(name = "p_guid", nullable = false)
    private EntityA parentEntity;


    public String getGuid() {
        return guid;
    }

    public Boolean getActual() {
        return actual;
    }

    public String getName() {
        return name;
    }

    public EntityA getParentEntity() {
        return parentEntity;
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

    public void setParentEntity(EntityA parentEntity) {
        this.parentEntity = parentEntity;
    }
}
