package com.example.jpademo;

import com.example.jpademo.dao.StudentDAO;
import com.example.jpademo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpademoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
        return  runner -> {
//            createMultipleStudent(studentDAO);

//            queryForStudents(studentDAO);
//            queryForLastName(studentDAO);

//            createStudent(studentDAO);
//            updateStudent(studentDAO);
            deleteStudent(studentDAO);

        };
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int rows = studentDAO.deleteAll();
        System.out.println(rows + " rows deleted");
    }

    private void updateStudent(StudentDAO studentDAO) {
            int studentId = 1;
        System.out.println("Getting student with id: " + studentId);
        Student myStudent = studentDAO.findById(studentId);
        System.out.println("Updating student with id: " + studentId);
        myStudent.setFirstName("John");
        studentDAO.update(myStudent);
        System.out.println("Updated student: " + myStudent);
    }

    private void queryForLastName(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findByLastName("Duck");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void queryForStudents(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Creating student object...");
        Student temoStudent = new Student("Daffy", "Duck","daffy@luv2code.com");
        System.out.println("Saving student object...");
        studentDAO.save(temoStudent);
        Integer theId = temoStudent.getId();
        System.out.println("Saved student. Generated id: " + theId);
        System.out.println("Retrieving student with id " + theId);
        Student myStudent = studentDAO.findById(theId);
        System.out.println("Found student: " + myStudent);
    }

    private void createMultipleStudent(StudentDAO studentDAO) {
        System.out.println("Creating 3 students object...");
        Student temoStudent2 = new Student("Jone", "Doe","john@luv2code.com");
        Student temoStudent1 = new Student("Mary", "Public","mary@luv2code.com");
        Student temoStudent3 = new Student("Bonita", "Applebum","bonita@luv2code.com");
        System.out.println("Saving students objects...");
        studentDAO.save(temoStudent1);
        studentDAO.save(temoStudent2);
        studentDAO.save(temoStudent3);
        System.out.println("Saved student1. Generated id: " + temoStudent1.getId());
        System.out.println("Saved student2. Generated id: " + temoStudent2.getId());
        System.out.println("Saved student3. Generated id: " + temoStudent3.getId());

    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student object...");
        Student temoStudent = new Student("Paul", "Doe","paul@luv2code.com");
        System.out.println("Saving student object...");
        studentDAO.save(temoStudent);
        System.out.println("Saved student. Generated id: " + temoStudent.getId());
    }
}
