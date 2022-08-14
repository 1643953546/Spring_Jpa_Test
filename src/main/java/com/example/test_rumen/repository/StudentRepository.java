package com.example.test_rumen.repository;

import com.example.test_rumen.entity.Student;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    public Student findByNameAndPassword(String name, String password);

    public List<Student> findByNameOrPassword(String name, String password);


    Integer countByPassword(String password);

    List<Student> findByNameLike(String name);

    List<Student> findByIdBetween(Integer lowNow, Integer highNow);


    public List<Student> findByOrderByIdAsc();

    public List<Student> findByOrderByIdDesc();

    public List<Student> findByOrderByIdDesc(PageRequest pageRequest);

}
