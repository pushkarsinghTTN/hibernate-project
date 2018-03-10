package com.hibernate.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Book {
    @Id
    private Integer id;
    private String bname;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getBname() {
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                '}';
    }
}