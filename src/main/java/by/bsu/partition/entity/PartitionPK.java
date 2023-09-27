package by.bsu.partition.entity;

import java.io.Serializable;

public class PartitionPK implements Serializable {

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
