package com.github.hcsp.encapsulation;

public class Cat {
    private static final Cat INVALID_CAT = new Cat("Invalid cat", -1);
    private String name;
    private int age;

    private Cat (String name,int age){
        this.name = name;
        this.age = age;
    }

    public static Cat newCat(String name, int age) {
        if (( age<0 ) || (name == null) || (name.isEmpty())) {
            return INVALID_CAT;
        }
        else {
            return new Cat(name,age);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
