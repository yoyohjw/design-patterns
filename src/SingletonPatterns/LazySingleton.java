package SingletonPatterns;

/**
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        //这里如果有多个线程同时访问到，会实例化多次。 线程不安全
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
