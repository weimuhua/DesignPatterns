package me.com.patterns.prototype;

import java.util.ArrayList;

/**
 * Created by wayne on 16-3-14.
 * prototype pattern
 * 原型模式，当类初始化需要消耗非常多的资源时，可通过使用原型拷贝来实现
 */
public class WordDocument implements Cloneable {

    private String text;
    private ArrayList<String> images = new ArrayList<String>();

    public WordDocument() {
        System.out.printf("WordDocument construction");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        WordDocument doc = (WordDocument) super.clone();
        doc.text = this.text;
        //doc.images = images;//浅拷贝
        doc.images = new ArrayList<String>(this.images);//深拷贝
        return doc;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }
}
