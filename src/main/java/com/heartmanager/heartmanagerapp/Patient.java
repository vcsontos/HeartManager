/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heartmanager.heartmanagerapp;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author valentin
 */
public class Patient {
    
    private Long id;
    private String name;
    private Integer age;
    private Sex sex;
    private Map<Integer, String> measurements;

    public Patient(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Map<Integer, String> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(Map<Integer, String> measurements) {
        this.measurements = measurements;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.age);
        hash = 53 * hash + Objects.hashCode(this.sex);
        hash = 53 * hash + Objects.hashCode(this.measurements);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (this.sex != other.sex) {
            return false;
        }
        if (!Objects.equals(this.measurements, other.measurements)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", measurements=" + measurements + '}';
    }
    
}
