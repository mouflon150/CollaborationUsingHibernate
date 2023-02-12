package com.it.kg.models;

import javax.persistence.*;

@Entity
@Table(name = "president")
public class President {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "president_id")
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    private Byte age;
    private String gender;
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "president")
//    @MapsId
//    @PrimaryKeyJoinColumn
//    private Company company;

    public President() {
    }

    public President(String fullName, Byte age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }

    @Override
    public String toString() {
        return "President{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
//                ", company=" + company +
                '}';
    }
}