package mainPackage;

/**
 * Created by isenseed on 12/14/2016.
 */
public class Perceptron {
    private int x;
    private int y;
    private int z;
    private int xWeight;
    private int yWeight;
    private int zWeight;
    private int threshold; // should this be a double?
    private int bias;

    //constructors
    public Perceptron(int i1) {
        x = i1;
    }

    public Perceptron(int i1, int i2) {
        x = i1;
        y = i2;
    }

    public Perceptron(int i1, int i2, int i3) {
        x = i1;
        y = i2;
        z = i3;
    }

    // setters
    public void setThreshold(int t) {
        threshold = t;
    }

    public void setBias(int b) {
        bias = b;
    }

    public void setxWeight(int x) {
        xWeight = x;
    }

    public void setyWeight(int y) {
        yWeight = y;
    }

    public void setzWeight(int z) {
        zWeight = z;
    }

    // the big math part, calculates if perceptron fires (return 1) or not (return 0)
    public int calc() {
        int e;
        if (y != 0 && z != 0) {
            e = bias + (x * xWeight) + (y * yWeight) + (z * zWeight);
        } else if (y != 0) {
            e = bias + (x * xWeight) + (y * yWeight);
        } else {
            e = bias + (x * xWeight);
        }
        return (e >= threshold) ? 1 : 0;
    }
}