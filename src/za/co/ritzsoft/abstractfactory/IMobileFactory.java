package za.co.ritzsoft.abstractfactory;

public interface IMobileFactory {
    IMobileFactory createMobile(String type);
}
