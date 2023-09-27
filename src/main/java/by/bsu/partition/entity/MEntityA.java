package by.bsu.partition.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "partition_a")
public class MEntityA {

    @EmbeddedId
    private PartitionID partitionID;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "parentEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<MEntityB> childEntityB;

    public PartitionID getPartitionID() {
        return partitionID;
    }

    public String getName() {
        return name;
    }

    public List<MEntityB> getChildEntityB() {
        return childEntityB;
    }

    public void setPartitionID(PartitionID partitionID) {
        this.partitionID = partitionID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChildEntityB(List<MEntityB> childEntityB) {
        this.childEntityB = childEntityB;
    }
}
