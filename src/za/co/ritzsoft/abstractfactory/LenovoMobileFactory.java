package za.co.ritzsoft.abstractfactory;

import za.co.ritzsoft.factory.Lenovo;

public class LenovoMobileFactory extends MobileFactory {
    Lenovo createLenovoMobile(){
        return new Lenovo();
    }
}
