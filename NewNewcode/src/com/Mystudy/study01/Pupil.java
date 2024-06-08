package com.Mystudy.study01;

public class Pupil {
    public String name;
    public int age;
    private double score;
    public Pupil(String name, int age, double score) {
        setName(name);
        setAge(age);
        setScore(score);
    }
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Test(){
        System.out.println("This is a test method for Pupil class.");
    }
    @Override
    public String toString() {
        return "Pupil{" + "name='" + name + '\'' + ", age=" + age + ", score=" + score + '}';
    }
}
