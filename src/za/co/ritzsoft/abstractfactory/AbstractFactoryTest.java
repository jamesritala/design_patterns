package za.co.ritzsoft.abstractfactory;

import za.co.ritzsoft.factory.Lenovo;
import za.co.ritzsoft.factory.Samsung;

public class AbstractFactoryTest {
    public static void main(String []args){
        MobileFactory factory= new MobileFactory();
        LenovoMobileFactory lmf= (LenovoMobileFactory) factory.createMobile("lenf");
        Lenovo ln= (Lenovo) lmf.createLenovoMobile();
        ln.pictureCapacity();
        SamsungMobileFactory smf= (SamsungMobileFactory) factory.createMobile("samf");
        Samsung sm= (Samsung)smf.createSamsungMobile();
        sm.pictureCapacity();
        sm.batteryPower();
    }
}
