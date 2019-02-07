package za.co.ritzsoft.abstractfactory;

import za.co.ritzsoft.factory.Samsung;

public class SamsungMobileFactory extends MobileFactory {
    Samsung createSamsungMobile(){
        return new Samsung();
    }
}
