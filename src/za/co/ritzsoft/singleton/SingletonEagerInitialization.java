package za.co.ritzsoft.singleton;

/*
* This is eager initialization because the instance is created when the class is loaded.
* */
public class SingletonEagerInitialization {
    private static SingletonEagerInitialization instance= new SingletonEagerInitialization();

    private SingletonEagerInitialization(){

    }

    public static SingletonEagerInitialization getInstance(){
        return instance;
    }
}
