package com.Mystudy.study01.poly_;

public class Master {
    private String name;
    public Master(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void Feed(Dog dog, Bone bone){
        System.out.println(name + " 投喂 " + dog.getName() + " 吃 " + bone.getName());
    }
    public void Feed(Cat cat, Fish fish){
        System.out.println(name + " 投喂 " + cat.getName() + " 吃 " + fish.getName());
    }
}
