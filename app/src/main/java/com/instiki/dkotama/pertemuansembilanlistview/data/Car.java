package com.instiki.dkotama.pertemuansembilanlistview.data;

public class Car {
    private String name;
    private int image;

    public Car(String name, int resId) {
        this.name = name;
        this.image = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
