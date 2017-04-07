package com.company;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Damian on 07.04.2017.
 */
@XmlRootElement
public class Student {
    private String indexNr;
    private String name;
    private String surname;

    public Student(){}

    public Student(String indexNr, String name, String surname){
        this.indexNr = indexNr;
        this.name = name;
        this.surname = surname;
    }

    public String getIndexNr() {
        return indexNr;
    }

    public void setIndexNr(String indexNr) {
        this.indexNr = indexNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
