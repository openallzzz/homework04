package com.openallzzz.entity;

public class User {

    private String id;
    private String name;
    private String sex;
    private String classno;
    private int age;

    public User() {
    }

    public User(String id, String name, String sex, String classno, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.classno = classno;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", classno='" + classno + '\'' +
                ", age=" + age +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
