package me.com.patterns.singleton;

/**
 * 是一种推荐的单例模式的实现方式，由双重锁保证了唯一性、线程安全性
 * 并且可以传递参数给构造函数
 */
public class DoubleCheckLock {

    private static volatile DoubleCheckLock sInstance;

    public static DoubleCheckLock getInstance() {
        if (sInstance == null) {
            synchronized (DoubleCheckLock.class) {
                if (sInstance == null) {
                    sInstance = new DoubleCheckLock();
                }
            }
        }
        return sInstance;
    }

    private DoubleCheckLock() {
    }
}
