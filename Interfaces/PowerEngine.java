package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts..");
    }

    @Override
    public void stop() {
        System.out.println("Stops..");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerates...");
    }
}
