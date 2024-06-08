package com.Mystudy.study01.Student;

public class test{
    public static void main(String[] args) {
        Student[] students = new Student[2];
        Teacher[] teachers = new Teacher[2];
        test t = new test();
        Person[] persons = new Person[4];
        persons[0] = new Student("xbw", 18, "male", "232411320113");
        persons[1] = new Student("lcw", 17, "female", "232411320098");
        persons[2] = new Teacher("xbwnibaba", 30, "male", 2.5);
        persons[3] = new Teacher("lcwnibaba", 31, "female", 3.0);
        //对成员进行年龄排序
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].getAge() < persons[j].getAge()) {
                    Person temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
        //打印排序后的数组并调用doSomething方法
        for (int i = 0; i <= persons.length - 1 ; i++) {
            System.out.println(persons[i]);
            t.doSomething(persons[i]);
        }
        //定义方法,形参为Person类型,功能:调用学生的study或教师的teach方法
    }
    public void doSomething(Person p){
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        }
        else{
            System.out.println("do nothing");
        }
    }
}
