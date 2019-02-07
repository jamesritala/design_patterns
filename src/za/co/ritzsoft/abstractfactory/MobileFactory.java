package za.co.ritzsoft.abstractfactory;

public class MobileFactory implements IMobileFactory{
    @Override
    public IMobileFactory createMobile(String type) {
        IMobileFactory mob=null;
        if("lenf".equalsIgnoreCase(type)){
            mob= new LenovoMobileFactory();
        }else if("samf".equalsIgnoreCase(type)){
            mob= new SamsungMobileFactory();
        }
        return mob;
    }
}
