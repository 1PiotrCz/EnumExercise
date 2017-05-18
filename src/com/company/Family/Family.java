package com.company.Family;

/**
 * Created by Piotr Czubkowski on 2017-05-18.
 */
public enum Family {
    Mom(67, 149),
    Dad(92, 181),
    Brother(72, 151),
    Sister(24, 43);

    private int weight;
    private int height;

    Family(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public float getBMI() {
        return (weight / ((float) height * (float) height)) * 10000;
    }

}
