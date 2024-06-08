package com.Mystudy.study01.Student;

public class Teacher extends Person{
    private double work_age;

    public Teacher(String name, int age, String gender, double work_age) {
        super(name,age,gender);
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺,我会认真教学.");
    }

    @Override
    public String play() {
        return "老师" + super.getName() + "爱玩象棋";
    }
    @Override
    public String toString(){
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", work_age=" + work_age +
                '}';
    }
}
