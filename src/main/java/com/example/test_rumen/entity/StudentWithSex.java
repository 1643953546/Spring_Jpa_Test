package com.example.test_rumen.entity;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "student_with_sex")
public class StudentWithSex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String password;

    private Integer status;

    private Timestamp date;

    private String sex;

    public StudentWithSex() {
    }

    public StudentWithSex(int id, String name, String password, Integer status, Timestamp date, String sex) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.status = status;
        this.date = date;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "StudentWithSex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                '}';
    }
}
