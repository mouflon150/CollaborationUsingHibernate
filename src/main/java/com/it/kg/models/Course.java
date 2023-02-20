package com.it.kg.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long id;
    @Column(name = "course_name")
    private String courseName;
    private Short staff;
    @ManyToOne//(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToMany(mappedBy = "course", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Student> students;

    public void removeStudent(Student student) {
        students.remove(student);
        student.setCourse(null);
    }

    public Course() {
    }

    public Course(String courseName, Short staff, Company company) {
        this.courseName = courseName;
        this.staff = staff;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Short getStaff() {
        return staff;
    }

    public void setStaff(Short staff) {
        this.staff = staff;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\nCourse{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", staff=" + staff +
//                ", company=" + company +
                ", students=" + students +
                '}';
    }
}
