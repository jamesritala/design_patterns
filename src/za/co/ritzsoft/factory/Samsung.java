package za.co.ritzsoft.factory;

public class Samsung implements IMobile {
    @Override
    public void cost() {
        System.out.println("Samsung costs start at 5000");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Samsung camera pixes are 20mp");
    }

    @Override
    public void batteryPower() {
        System.out.println("3500mah");
    }

    @Override
    public String toString() {
        return "Samsung: "+super.toString();
    }
}
