package SingletonPatterns;

/**
 * 懒汉式（线程安全，但是效率低）
 */
public class LazySafeSingleton {

    private static LazySafeSingleton lazySafeSingleton;

    private LazySafeSingleton() {

    }

    public synchronized static LazySafeSingleton getInstance() {
        if (lazySafeSingleton == null) {
            lazySafeSingleton = new LazySafeSingleton();
        }
        return lazySafeSingleton;
    }

}
