package za.co.ritzsoft.singleton;


/*
 * This is lazy initialization because the instance is created upon first request and not when the class is loaded.
 * */
public class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization(){

    }

    public static SingletonLazyInitialization getInstance(){
        if(instance==null){
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }
}
