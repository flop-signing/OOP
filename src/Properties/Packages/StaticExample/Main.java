package Properties.Packages.StaticExample;

public class Main {

    public static void main(String[] args) {
//        Human mehedi=new Human(23,"Mehedi",40000,false);
//        Human sabu=new Human(20,"Saba",35000,false);
//        System.out.println(sabu.population);
//        System.out.println(mehedi.population);




    // to access it we can use Main method:
        // You can't access non static stuff without referencing their instances in a static context.For this reason
        // we referencing it in this way. Other wise it can't be accessable.
//        Main main=new Main();
//        main.greeting();


        //greeting();
    }


    // this is not depend on object.
    static void fun()
    {
       // greeting();  // you can use this because it requires an instance.
        // but he function you are using it that doesn't depend on object.
    }

    // We know that something is not static,belongs to an object.
    void greeting(){
        System.out.println("Hello world.");
    }
}
