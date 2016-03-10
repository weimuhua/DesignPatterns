package me.com.patterns.singleton;

/**
 * 推荐的单例模式实现方式，既保证了懒加载，线程安全性又由JVM保证
 * 缺点是getInstance方法不能携带参数
 */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }
}
