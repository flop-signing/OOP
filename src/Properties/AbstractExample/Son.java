package Properties.AbstractExample;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void Career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void Partner() {

        System.out.println("I love her and She is 22");
    }


}
