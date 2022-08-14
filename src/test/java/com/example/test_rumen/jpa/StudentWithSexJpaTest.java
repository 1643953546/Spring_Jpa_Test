package com.example.test_rumen.jpa;

import com.example.test_rumen.entity.StudentWithSex;
import com.example.test_rumen.repository.StudentWithSexRepository;
import com.example.test_rumen.vo.CountMaleAndFemale;
import com.example.test_rumen.vo.StudentWithNameAndSex;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class StudentWithSexJpaTest {
    @Autowired
    private StudentWithSexRepository studentWithSexWithSexRepository;

    @Test
    public void save(){
        StudentWithSex StudentWithSex1=new StudentWithSex();
        StudentWithSex1.setName("huang1");
        StudentWithSex1.setPassword("1231");
        StudentWithSex1.setSex("female");
        StudentWithSex1.setDate(new Timestamp(new Date().getTime()));

        StudentWithSex StudentWithSex2=new StudentWithSex();
        StudentWithSex2.setName("huang2");
        StudentWithSex2.setPassword("1232");
        StudentWithSex2.setSex("female");
        StudentWithSex2.setDate(new Timestamp(new Date().getTime()));

        StudentWithSex StudentWithSex3=new StudentWithSex();
        StudentWithSex3.setName("huang3");
        StudentWithSex3.setPassword("1233");
        StudentWithSex3.setSex("female");
        StudentWithSex3.setDate(new Timestamp(new Date().getTime()));

        StudentWithSex StudentWithSex4=new StudentWithSex();
        StudentWithSex4.setName("huang4");
        StudentWithSex4.setPassword("1234");
        StudentWithSex4.setSex("female");
        StudentWithSex4.setDate(new Timestamp(new Date().getTime()));

        StudentWithSex StudentWithSex5=new StudentWithSex();
        StudentWithSex5.setName("huang5");
        StudentWithSex5.setPassword("125");
        StudentWithSex5.setSex("male");
        StudentWithSex5.setDate(new Timestamp(new Date().getTime()));

        studentWithSexWithSexRepository.save(StudentWithSex1);
        studentWithSexWithSexRepository.save(StudentWithSex2);
        studentWithSexWithSexRepository.save(StudentWithSex3);
        studentWithSexWithSexRepository.save(StudentWithSex4);
        studentWithSexWithSexRepository.save(StudentWithSex5);

    }


    @Test
    public void setResultMyself(){
        List<StudentWithNameAndSex> studentOnlyNameAndSex = studentWithSexWithSexRepository.getStudentOnlyNameAndSex();
        System.out.println(studentOnlyNameAndSex);
    }

    //group by
    @Test
    public void findAllGroupBySex(){
        List<CountMaleAndFemale> countMaleAndFemales = studentWithSexWithSexRepository.countSexAsMaleAndFemale();
        System.out.println(countMaleAndFemales);
    }

    @Test
    public void setResultUseT(){
//        Object studentOnlyNameAndSexUseT = studentWithSexWithSexRepository.getStudentOnlyNameAndSexUseT();
//        System.out.println(studentOnlyNameAndSexUseT);
    }
}
