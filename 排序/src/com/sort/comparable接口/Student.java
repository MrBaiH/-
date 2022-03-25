package com.sort.comparable接口;

/**
 * @Author baixu
 * @Date 2022/3/7 0007 19:30
 * Version 1.0
 * @Description :
 */
public class Student implements Comparable<Student>{
    private String userName;
    private int age;

    public Student() {
    }

    public Student(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return this.age-s.age;
    }
}
