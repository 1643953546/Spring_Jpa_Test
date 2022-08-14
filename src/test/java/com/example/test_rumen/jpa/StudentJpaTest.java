package com.example.test_rumen.jpa;

import com.example.test_rumen.entity.Student;
import com.example.test_rumen.repository.StudentRepository;
import javafx.print.PageRange;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

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
    //查询所有
    public void findAll(){
        List<Student> students = studentRepository.findAll();
        System.out.println(students);
    }

    //多条件与查询
    @Test
    public void findByStudentNameAndPassword(){
        String name="huang2";
        String password="1232";
        Student byNameAndPassword = studentRepository.findByNameAndPassword(name, password);
        System.out.println(byNameAndPassword);
    }

    //多条件或查询
    @Test
    public void findByStudentNameOrPassword(){
        String name="huang1";
        String password="1232";
        List<Student> byNameOrPassword = studentRepository.findByNameOrPassword(name, password);
        System.out.println(byNameOrPassword);
    }

    //总数查询
    @Test
    public void findCount(){
        long count = studentRepository.count();
        System.out.println(count);
    }

    @Test
    //根据字段查询总数
    public void findCountByName(){
        String password="1234";
        Integer countByPassword = studentRepository.countByPassword(password);
        System.out.println(countByPassword);
    }

    @Test
    //模糊查询
    public void findByNameLike(){
        String name="%huang%";
        //这个查询要加上%
        List<Student> byNameLike = studentRepository.findByNameLike(name);
        System.out.println(byNameLike);
    }

    @Test
    //between查询
    public void findByIdBetween(){
        Integer lowNow=1;
        Integer highNow=4;
        List<Student> byIdBetween = studentRepository.findByIdBetween(lowNow, highNow);
        System.out.println(byIdBetween);
    }


    @Test
    //排序
    public void findAllByPage(){
        //升序
        List<Student> studentsASC = studentRepository.findByOrderByIdAsc();
        System.out.println(studentsASC);

        //降序
        List<Student> studentsDesc = studentRepository.findByOrderByIdDesc();
        System.out.println(studentsDesc);
    }


    @Test
    //分页也就是limit
    //分页加排序
    public void findByLimit(){
        Integer page=1;
        Integer pageSize=2;

        //第一种
        PageRequest pageRequest = PageRequest.of(page-1, pageSize);
        List<Student> byOrderByIdDesc = studentRepository.findByOrderByIdDesc(pageRequest);
        System.out.println(byOrderByIdDesc);
    }
}
