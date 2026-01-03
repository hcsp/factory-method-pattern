package com.github.hcsp.encapsulation;

public class Cat {
    private static final Cat INVALID_CAT = new Cat("Invalid cat",-1);
    private String name;
    private int age;

    /**
     * 创建一只猫的工厂方法。当传入的参数无效，即：
     * age小于0
     * name是空字符串或者null时
     * 返回预先创建好的{@link #INVALID_CAT}；
     * 否则，返回一只新创建的猫
     *
     * @param age 年龄
     * @param name 名字
     * @return 创建的猫
     */

    private Cat (String name,int age){                     // constructor私有化
        this.name = name;
        this.age =age;
    }
    public static Cat newCat(String name, int age) {         // 工厂方法
        if ( age < 0 || name ==null || name.isEmpty()){
            return INVALID_CAT;
        }
        else {
            return new Cat(name, age);
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
