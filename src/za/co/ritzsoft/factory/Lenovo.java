package za.co.ritzsoft.factory;

public class Lenovo implements IMobile {
    @Override
    public void cost() {
        System.out.println("Lenovo costs start at 10000");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Lenovo camera pixes are 10mp");
    }

    @Override
    public void batteryPower() {
        System.out.println("3200mah");
    }

    @Override
    public String toString() {
        return "Lenovo: "+super.toString();
    }
}
