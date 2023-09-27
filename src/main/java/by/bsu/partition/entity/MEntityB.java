package by.bsu.partition.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "partition_b")
public class MEntityB {

    @EmbeddedId
    private PartitionID partitionID;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "p_actual", nullable = false)
    @JoinColumn(name = "p_guid", nullable = false)
    private MEntityA parentEntity;

    public PartitionID getPartitionID() {
        return partitionID;
    }

    public String getName() {
        return name;
    }

    public MEntityA getParentEntity() {
        return parentEntity;
    }

    public void setPartitionID(PartitionID partitionID) {
        this.partitionID = partitionID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentEntity(MEntityA parentEntity) {
        this.parentEntity = parentEntity;
    }
}
