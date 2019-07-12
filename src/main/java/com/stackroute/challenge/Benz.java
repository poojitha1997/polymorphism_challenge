package main.java.com.stackroute.challenge;

public class Benz extends Car{
    public Benz(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Benz -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Benz -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Benz -> brake()");
    }

}
