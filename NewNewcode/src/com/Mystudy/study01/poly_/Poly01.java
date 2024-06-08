package com.Mystudy.study01.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("tom");
        Dog dog = new Dog("jerry");
        Bone bone = new Bone("大棒骨");
        Cat cat = new Cat("Kitty");
        Fish fish = new Fish("鲤鱼");
        master.Feed(dog, bone);
        master.Feed(cat, fish);
    }
}
