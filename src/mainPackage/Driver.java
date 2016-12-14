package mainPackage;

/**
 * Created by isenseed on 12/14/2016.
 */
public class Driver {
    public static void main(String[] args) {
        Perceptron p = new Perceptron(12, -99);
        p.setThreshold(0);
        p.setBias(3);
        p.setxWeight(-2);
        p.setyWeight(-2);
        System.out.println(p.calc());
    }
}