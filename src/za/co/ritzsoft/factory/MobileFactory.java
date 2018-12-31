package za.co.ritzsoft.factory;

public class MobileFactory {

    IMobile createMobile(String type){
        IMobile mob=null;
        if(type.equalsIgnoreCase("len")){
            mob= new Lenovo();
            System.out.println("Lenovo created");
        }else if(type.equalsIgnoreCase("sam")){
            mob= new Samsung();
            System.out.println("Samsung created");
        }
        return mob;
    }
}
