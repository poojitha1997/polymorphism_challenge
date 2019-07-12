package main.java.com.stackroute.challenge;

public class Audi extends Car{
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi-> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Audi -> brake()");
    }
}
