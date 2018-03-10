package com.hibernate.demo;
import javax.persistence.*;
import java.util.*;
@Entity
public class Author{
    @Id
    private Integer id;
    private String fname;
    private String lname;
    private Integer age;
    @Temporal(TemporalType.DATE)
    private Calendar date;
    @Embedded
    private Address address;
    @ElementCollection
    List<String> subjects= new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(joinColumns = @JoinColumn(name="AUTHOR_ID"),inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
    Collection<Book> book= new HashSet<Book>();
    public Calendar getDate() {
        return date;
    }
    public void setDate(Calendar date) {
        this.date = date;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public List<String> getSubjects() {
        return subjects;
    }
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
    public Collection<Book> getBook() {
        return book;
    }
    public void setBook(Collection<Book> book) {
        this.book = book;
    }
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", address=" + address +
                ", subjects=" + subjects +
                ", book=" + book +
                '}';
    }
}