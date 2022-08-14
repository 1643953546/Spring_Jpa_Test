package com.example.test_rumen.jpa;

import com.example.test_rumen.entity.Student;
import com.example.test_rumen.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class StudentJpaTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void save(){
        Student student1=new Student();
        student1.setName("huang1");
        student1.setPassword("1231");
        student1.setDate(new Timestamp(new Date().getTime()));

        Student student2=new Student();
        student2.setName("huang2");
        student2.setPassword("1232");
        student2.setDate(new Timestamp(new Date().getTime()));

        Student student3=new Student();
        student3.setName("huang3");
        student3.setPassword("1233");
        student3.setDate(new Timestamp(new Date().getTime()));

        Student student4=new Student();
        student4.setName("huang4");
        student4.setPassword("1234");
        student4.setDate(new Timestamp(new Date().getTime()));

        Student student5=new Student();
        student5.setName("huang5");
        student5.setPassword("125");
        student5.setDate(new Timestamp(new Date().getTime()));

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);
        studentRepository.save(student5);

    }

    @Test
    public void findAll(){
        List<Student> students = studentRepository.findAll();
        System.out.println(students);
    }

    @Test
    public void findByStudentNameAndPassword(){
        String name="huang2";
        String password="1232";
        Student byNameAndPassword = studentRepository.findByNameAndPassword(name, password);
        System.out.println(byNameAndPassword);
    }
}
