package org.practice;

class Student{
    private int id;
    private String name;
    private int age;

    //creating same constructors with same name and different parameters is called constructor overloading.
    public Student(int id, String name, int age) {
        //super()/this();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(){
        //every constructor's first statement is always a super method if you write it or don't
        //only in 1 case super() wont be there if there's a this() method instead of super/
        //the difference is that super() will call the constructor of the parent class and this() will call the const of the current class
        //super()/this();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}


public class LaunchConstructor {

    public static  void  main(String[] args){
        Student stu = new Student();
        stu.setId(1);
        stu.setName("Ugam");
        stu.setAge(25);

        System.out.println(stu.getId() + " " + stu.getAge() + " " + stu.getName());
    }
}
