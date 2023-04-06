package staticDemo;

import java.util.ArrayList;

public class StudentDemo {
    private StudentDemo(){}

    public static int getMaxAgeStudent(ArrayList<student> ne){

        int max = ne.get(0).getAge();

        for (int i = 0; i < ne.size(); i++) {
            int tempAge = ne.get(i).getAge();
             if(tempAge > max){
                 max = tempAge;
             }
        }
        return max;
    }
}
