package za.co.ritzsoft.singleton;

import java.io.Serializable;

public class SingletonPreventSerializationProblem implements Serializable {

    private static SingletonPreventSerializationProblem instance = new SingletonPreventSerializationProblem();

    private SingletonPreventSerializationProblem(){}

    public static SingletonPreventSerializationProblem getInstance(){
        return instance;
    }

    /*
    *
    * When we serialize an object and deserialize it again, there are different hashcode values generated . So the singleton principle breaks in this case.
    * To fix the issue we implement the readResolve method.
    * */

    private Object readResolve(){
        System.out.println("Applying read resolve....");
        return instance;
    }
}
