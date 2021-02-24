package SingletonPatterns;

/**
 * 双检锁
 *
 * 加volatile修饰符 为了防止 重排序 导致 空指针
 *
 */
public class DoubleLockSingleton {

    private volatile static DoubleLockSingleton doubleLockSingleton;

    private DoubleLockSingleton() {

    }

    public static DoubleLockSingleton getInstance() {
        if (doubleLockSingleton == null) {
            synchronized (DoubleLockSingleton.class) {
                if (doubleLockSingleton == null) {
                    doubleLockSingleton = new DoubleLockSingleton();
                }
            }
        }
        return doubleLockSingleton;
    }

}
