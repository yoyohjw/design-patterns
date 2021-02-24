package SingletonPatterns;

/**
 * 双检锁
 *
 * 加volatile修饰符 为了防止 重排序 导致 空指针
 *
 * 通过javac DoubleLockSingleton.java编译为class文件
 * 通过javap -c DoubleLockSingleton可以发现 new DoubleLockSingleton()不是一个原子指令
 * 第一步为 new(创建对象实例，分配内存)
 * 第二步为 invokespecial(调用构造器，执行初始化)
 * 第三步为 astore_1 将对象引用赋值给变量
 * 虚拟机运行时， 第二步与第三步可能会发生重排序
 *
 * 如果线程1先执行第三步， 而此时线程2进入，此时对象已不为null，由于对象并未执行第二步初始化会导致线程2出错
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
