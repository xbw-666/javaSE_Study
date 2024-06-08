package com.Mystudy.study01.Student;

public class Student extends Person {
    private String address;

    public Student(String name, int age, String gender, String address) {
        super(name, age, gender);
        this.address = address;
    }
    public void study(){
        System.out.println("我承诺,我会好好学习.");
    }

    @Override
    public String play() {
        return "学生" + super.getName() + "爱玩足球";
    }
    @Override
    public String toString(){
        return "学生{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
