package staticDemo;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<student>ne = new ArrayList<student>();

        student stu1 = new student("罗布", 255, "男");
        student stu2 = new student("火炭", 24,"男");
        student stu3 = new student("泰罗", 25, "男");

        ne.add(stu1);
        ne.add(stu2);
        ne.add(stu3);

        int maxAgeStudent = StudentDemo.getMaxAgeStudent(ne);
        System.out.println(maxAgeStudent);
    }
}
