package za.co.ritzsoft.singleton;

public class IntelliJSingleton {
    private static IntelliJSingleton ourInstance = new IntelliJSingleton();

    public static IntelliJSingleton getInstance() {
        return ourInstance;
    }

    private IntelliJSingleton() {
    }
}
