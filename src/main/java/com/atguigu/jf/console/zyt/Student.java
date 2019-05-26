package com.atguigu.jf.console.zyt;

public class Student {

    static String staticName ;
//    static {
//        System.out.println(staticName);
//        staticName="静态代码块赋值";
//        System.out.println(staticName);
//    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Student(){

         this(staticName);
        this.staticName="dsads";
        System.out.println(staticName);
        name="构造器赋值变量赋值李四";
        System.out.println(name);
    }

    private String name="成员变量赋值张三";
    {
       System.out.println("非静态代码块 "+name);
    }

    Student(String name) {
        this.name=name;
    }


    public static void main(String args[]){

        new Student();

    }
}
