package za.co.ritzsoft.singleton;


/*
* Prevent cloning of an object by throwing a CloneNotSupportedException in the clone method
* */
public class SingletonPreventCloning implements Cloneable{

    private static SingletonPreventCloning instance= new SingletonPreventCloning();

    public static SingletonPreventCloning getInstance(){
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        if(instance!=null) throw new CloneNotSupportedException("Not allowed to clone this object");
        else return new SingletonPreventCloning();
    }
}
