package Properties.Generics.Comparing;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student mehedi=new Student(12,89.84f);
        Student rahul=new Student(14,85.84f);
        Student pickul=new Student(15,96.84f);

        Student samir=new Student(17,91.84f);

        Student huraira=new Student(4,95.84f);

        Student[] list={mehedi,rahul,pickul,samir,huraira};
        Arrays.sort(list);

        if(mehedi.compareTo(rahul)<0)
        {
            System.out.println("Rahul has more marks.");
        }
    }

}
