package za.co.ritzsoft.singleton;


/*
*  There are people who can use reflection to make the private constructor accessible. For example using the code below
*
*  Class clazz= Class.forName("za.co.ritzsoft.singleton.SingletonPreventReflection");
*  Constructor<SingletonPreventReflection> ctor= clazz.getDeclaredContructor();
*  ctor.setAccessible(true);
*  SingletonPreventReflection obj = ctor.newInstance();
*
*
* */
public class SingletonPreventReflection {
    private static SingletonPreventReflection instance;

    private SingletonPreventReflection(){
        if(instance!=null){
            throw new RuntimeException("Cannot create another instance of this class...");
        }

    }

    public static SingletonPreventReflection getInstance(){
        if(instance==null) {
            instance = new SingletonPreventReflection();
        }

        return instance;
    }
}
