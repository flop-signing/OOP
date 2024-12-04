package Properties.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media mediaPlayer=new CdPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start()
    {
        engine.Start();
    }

    public void stop()
    {
        engine.Stop();
    }

    public void startMusic()
    {
        mediaPlayer.Start();
    }

    public void stopMusic()
    {
        mediaPlayer.Stop();
    }

    public void upgradeEngine(Engine engine)
    {
        this.engine=engine;
    }
}
