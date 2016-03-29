package me.com.patterns.memento;

public class CallOnDuty {

    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "AK47";

    public void play() {
        System.out.println("玩游戏 : " + String.format("第%d关", mCheckPoint) + " 干干干!!!");

        mLifeValue -= 10;

        System.out.println("进度升级");

        mCheckPoint++;

        System.out.println("到达: " + String.format("第%d关", mCheckPoint));
    }

    public void quit() {
        System.out.println("退出游戏, " + toString());
    }

    public Memento createMemento() {
        System.out.println("保存进度");
        Memento memento = new Memento();
        memento.checkPoint = mCheckPoint;
        memento.leftValue = mLifeValue;
        memento.weapon = mWeapon;
        return memento;
    }

    public void restore(Memento memento) {
        System.out.println("读取进度");
        mCheckPoint = memento.checkPoint;
        mLifeValue = memento.leftValue;
        mWeapon = memento.weapon;
        System.out.println("当前状态 : " + toString());
    }

    @Override
    public String toString() {
        return "CallOnDuty [mCheckPoint=" + mCheckPoint
                + ", mLeftValue=" + mLifeValue
                + ", mWeapon=" + mWeapon
                + "]";
    }
}
