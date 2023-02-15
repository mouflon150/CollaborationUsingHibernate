package com.it.kg.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "number_of_staff")
    private int numberOfStaff;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "president_id")
    private President president;
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Course> courses;

    public Company() {
    }

    public Company(String companyName, int numberOfStaff) {
        this.companyName = companyName;
        this.numberOfStaff = numberOfStaff;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "\nCompany{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", numberOfStaff=" + numberOfStaff +
//                ", president=" + president +
                ", courses=" + courses +
                '}';
    }
}