package za.co.ritzsoft.singleton;

/*
* Singleton will only work properly in multithreaded environments only if EAGER initialization has been done because
* in this instance creation will only happen at the time of class loading only.
*
* But for lazy instatiaton we will have to take care of multiple things.
* */
public class SingletonThreadSafe {
    private static SingletonThreadSafe instance=null;

    public static synchronized SingletonThreadSafe getInstance(){
        if(instance==null){
            instance= new SingletonThreadSafe();
        }

        return instance;
    }
}
