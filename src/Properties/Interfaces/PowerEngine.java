package Properties.Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void Start() {
        System.out.println("Power Engine Start.");
    }

    @Override
    public void Stop() {
        System.out.println("Power Engine Stop.");
    }

    @Override
    public void Accelerate() {
        System.out.println("Power Engine Accelerate.");
    }
}
