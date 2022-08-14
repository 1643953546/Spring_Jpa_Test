package com.example.test_rumen.vo;

import lombok.Data;
import lombok.Value;

public class CountMaleAndFemale {
    private Integer count;
    private String sex;

    public CountMaleAndFemale(Integer count, String sex) {
        this.count = count;
        this.sex = sex;
    }

    public CountMaleAndFemale(String sex) {
        this.sex = sex;
    }

    public CountMaleAndFemale() {
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
