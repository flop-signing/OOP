package Properties.Introduction;

public class WrapperExample {
    public static void main(String[] args) {
        //    int a=10;
//    Integer ab=10;  // this is created like as a object

        Integer a=45;
        Integer b=34;
        swap(a,b);
    }

    static void  swap(Integer a,Integer b)
    {
        Integer temp=a;
        a=b;
        b=temp;
    }

    //This not swapping after using the object type wrapper class. The reason is the Integer is a final class.
}
class A{
    final int num=20; // Final is always be initialized because it's can't be modified.
}