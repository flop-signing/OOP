package Properties.Interfaces;

public class CdPlayer implements Media{
    @Override
    public void Start() {
        System.out.println("Music Start.");
    }

    @Override
    public void Stop() {
        System.out.println("Music Stop.");
    }
}
