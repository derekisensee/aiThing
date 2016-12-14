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

    public void setThreshold(int t) {
        threshold = t;
    }

    public void setBias(int b) {
        bias = b;
    }

    public int calc() {
        int e;
        if (y != 0 && z != 0) {
            e = bias + (x * xWeight) + (y * yWeight) + (z * zWeight);
        } else if (y != 0) {
            e = bias + (x * xWeight) + (y * yWeight);
        } else {
            e = bias + (x * xWeight);
        }
        return (e < threshold) ? 0 : 1;
    }
}