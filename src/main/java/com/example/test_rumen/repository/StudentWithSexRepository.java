package com.example.test_rumen.repository;

import com.example.test_rumen.entity.Student;
import com.example.test_rumen.entity.StudentWithSex;
import com.example.test_rumen.vo.CountMaleAndFemale;
import com.example.test_rumen.vo.StudentWithNameAndSex;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentWithSexRepository extends JpaRepository<StudentWithSex,Integer> {
    @Query(value = "select com.example.test_rumen.vo.StudentWithNameAndSex(s.name,s.sex) from student_with_sex s")
    public List<CountMaleAndFemale> countSexAsMaleAndFemale();

    @Query(value = "select sex as sex " +
            "from student_with_sex")
    public List<StudentWithNameAndSex> getStudentOnlyNameAndSex();

    public <T>T getStudentOnlyNameAndSexUseT(Class<T> type);
}
