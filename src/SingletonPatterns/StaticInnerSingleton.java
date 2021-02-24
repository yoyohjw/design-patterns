package SingletonPatterns;

public class StaticInnerSingleton {

    private StaticInnerSingleton() {

    }

    private static class InnerSingleton {
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return InnerSingleton.instance;
    }

}
