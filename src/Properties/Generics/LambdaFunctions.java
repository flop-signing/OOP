package Properties.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            arr.add(i);
        }

//        arr.forEach((item)->{
//            System.out.println(item*2);
//        });

        // If store this in a consumer type, then
        Consumer<Integer> con=(item)->System.out.println(item*2);
        arr.forEach(con);

        // If there are more than one parameter then we create an interface on that specific case.

        Operation sum=(a,b)->(a+b);
        Operation prod=(a,b)->(a*b);
        Operation sub=(a,b)->(a-b);

        LambdaFunctions myCalculator=new LambdaFunctions();
        System.out.println(myCalculator.operate(3,4,sum));
        System.out.println(myCalculator.operate(3,4,prod));
        System.out.println(myCalculator.operate(3,4,sub));
    }


    // Lambda functions are online functions that means it do it in oneline only.
   private int operate(int a,int b, Operation op)
   {
        return op.operation(a,b);
   }


}


interface Operation{
    int operation(int a,int b);
}