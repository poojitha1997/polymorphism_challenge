package main.java.com.stackroute.challenge;

public class Porsche extends Car{
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Porsche -> brake()");
    }
}
