package ch1;

import java.lang.reflect.Field;

public class VisitStudent {
    public static void main(String[] args) throws Exception{
        //create a instance of Student
        Student p = new Student();
        // get the Class of the Student
        Class cla = Student.class;

        //get the name property of the Student,and use getDeclaredField() to visit
        //each level property
        Field nameField = cla.getDeclaredField("name");
        //set when use reflect visit this field,cancel the check
        nameField.setAccessible(true);
        //invoke set() method to set the value of instance Field which belongs to instance p
        nameField.set(p,"Jack");

        //As like the name property to set agr property
        Field ageField = cla.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(p,25);

        System.out.println(p);
    }
}

class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "name is " + name +" ,age is " + age;
    }
}
