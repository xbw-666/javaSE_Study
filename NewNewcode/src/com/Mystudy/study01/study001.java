package com.Mystudy.study01;

public class study001 {
    public static void main(String[] args) {
        person p1 = new person("Jo", 123, "Male");
        System.out.println("Name: "+p1.getName()+" Age: "+p1.getAge()+" Gender: "+p1.getGender());
    }
}
class person{
    public String name;
    private int age;
    private String gender;
    public person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
        setName(name);
        setAge(age);
        setGender(gender);
    }
    public void setName(String name) {
        if(name.length()>2&&name.length()<10){
            this.name = name;
        }
        else{
            System.out.println("Name should be between 3 and 9 characters");
            this.name="邢博威的星怒";
        }
    }
    public void setAge(int age) {
       if(age>0&&age<100){
           this.age=age;
       }
       else{
           System.out.println("Age should be between 0 and 100");
           this.age=18;
           System.out.println("希望你永远年轻");
       }
    }
    public void setGender(String gender) {
        if(gender.equals("Male")||gender.equals("Female")){
            this.gender=gender;
        }
        else{
            System.out.println("Gender should be Male or Female");
            this.gender="Male";
        }
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
}