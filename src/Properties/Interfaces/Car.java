package Properties.Interfaces;

public class Car implements Engine, Brake{
    @Override
    public void Brake() {
        System.out.println("I brake like a normal car.");
    }

    @Override
    public void Start() {
        System.out.println("I start like a normal car.");
    }

    @Override
    public void Stop() {
        System.out.println("I stop like a normal car.");
    }

    @Override
    public void Accelerate() {
        System.out.println("I Accelerate like a normal car.");
    }
}
