package Properties.AbstractExample;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void Career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void Partner() {
        System.out.println("I love him");
    }
}
