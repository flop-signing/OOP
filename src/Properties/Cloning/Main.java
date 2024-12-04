package Properties.Cloning;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
        Human mehedi=new Human(34,"Mehedi");
//        Human another=new Human(mehedi);

        Human twin=(Human) mehedi.clone();
        System.out.println(twin.age +" "+twin.name);
    }
}
