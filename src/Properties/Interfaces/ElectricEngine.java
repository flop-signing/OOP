package Properties.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void Start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void Stop() {
        System.out.println("Electric Engine stop");
    }

    @Override
    public void Accelerate() {
        System.out.println("Electric Engine accelerate");
    }
}
