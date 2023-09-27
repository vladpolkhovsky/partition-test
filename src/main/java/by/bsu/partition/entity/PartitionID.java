package by.bsu.partition.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PartitionID implements Serializable {

    private String guid;

    private Boolean actual;

    public String getGuid() {
        return guid;
    }

    public Boolean getActual() {
        return actual;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }
}
