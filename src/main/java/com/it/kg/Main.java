package com.it.kg;

import com.it.kg.models.Company;
import com.it.kg.models.Course;
import com.it.kg.models.President;
import com.it.kg.models.Student;
import com.it.kg.service.implementation.CompanyServiceImpl;
import com.it.kg.service.implementation.CourseServiceImpl;
import com.it.kg.service.implementation.PresidentServiceImpl;
import com.it.kg.service.implementation.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        President president = new President("Talant bayke", (byte) 40, "Male");
        Company company = new Company("IT.KG", 12, president);
        president.setCompany(company);

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java Backend", (short) 4,company));
        courses.add(new Course("JavaScript", (short) 2,company));
        company.setCourses(courses);

        List<Student> javaBackendGroup = new ArrayList<>();
        javaBackendGroup.add(new Student("Temirbaev Marlen", 17, "Male", courses.get(0)));
        javaBackendGroup.add(new Student("Apsamatov Bakyt", 17, "Male", courses.get(0)));
        javaBackendGroup.add(new Student("Abdullaev Dastan", 15, "Male", courses.get(0)));
        courses.get(0).setStudents(javaBackendGroup);

        List<Student> javaScriptGroup = new ArrayList<>();
        Student student = new Student("Daniel Ahadzhanov", 15, "Male", courses.get(1));
        javaScriptGroup.add(new Student("Ratbek Bro", 17, "Male", courses.get(1)));
        javaScriptGroup.add(new Student("Jumagul Girl", 17, "Female", courses.get(1)));
        javaScriptGroup.add(student);
        courses.get(1).setStudents(javaScriptGroup);

        PresidentServiceImpl presidentService = new PresidentServiceImpl();
        CompanyServiceImpl companyService = new CompanyServiceImpl();
        CourseServiceImpl courseService = new CourseServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();

//        presidentService.save(president);
//        presidentService.deleteById(2L);
        studentService.deleteById(15L);
    }
}