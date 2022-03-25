package com.sort.comparable接口.test;

import com.sort.comparable接口.Student;

/**
 * @Author baixu
 * @Date 2022/3/7 0007 19:31
 * Version 1.0
 * @Description :
 */
public class TestComparable {
    public static Comparable getAge(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        if(result>=0){
            return c1;
        }
        return c2;
    }

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",20);
        System.out.println(getAge(s1,s2));
    }
}
