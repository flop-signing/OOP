package Properties.Packages.StaticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population;


    static void message(){
        System.out.println("This is Human");
    }
    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population+=1;

        Human.message();
    }
}
