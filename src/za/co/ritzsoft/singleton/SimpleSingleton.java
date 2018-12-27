package za.co.ritzsoft.singleton;

public class SimpleSingleton {

    private static SimpleSingleton instance; //Eager Initialization would create new instance here so that instance is created upon class loading

    private SimpleSingleton(){

    }

    public static SimpleSingleton getInstance(){
        if(instance==null) { //Lazy Initialization approach
            instance = new SimpleSingleton();
        }

        return instance;
    }
}
