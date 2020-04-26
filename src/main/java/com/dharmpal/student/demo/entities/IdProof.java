package com.dharmpal.student.demo.entities;

import com.dharmpal.student.demo.enums.Idtype;

import javax.persistence.Embeddable;
import java.sql.Blob;

@Embeddable
public class IdProof {
    private Idtype idType;
    private String idNumber;
    private Blob idDoc;


    public Idtype getIdType() {
        return idType;
    }

    public void setIdType(Idtype idType) {
        this.idType = idType;
    }

    public String getIdNumber() { return idNumber; }

    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }

    public Blob getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Blob idDoc) {
        this.idDoc = idDoc;
    }

    @Override
    public String toString() {
        return "IdProof{" +
                "idType=" + idType +
                ", idNumber='" + idNumber + '\'' +
                ", idDoc=" + idDoc +
                '}';
    }
}
