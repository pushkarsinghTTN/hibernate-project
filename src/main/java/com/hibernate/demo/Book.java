package com.hibernate.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Book {
    @Id
    private Integer id;
    private String bname;
    @ManyToMany(mappedBy = "book")
    List<Author> mylist=new ArrayList<>();
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
    public List<Author> getMylist() {
        return mylist;
    }
    public void setMylist(List<Author> mylist) {
        this.mylist = mylist;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", mylist=" + mylist +
                '}';
    }
}