package SingletonPatterns;

/**
 * 饿汉式 - 线程安全，但是类加载时就实例化，浪费内存
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
