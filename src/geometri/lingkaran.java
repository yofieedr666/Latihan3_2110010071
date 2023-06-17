
package geometri;

public class lingkaran {
private final double radius;

    public lingkaran(double radius) {
        this.radius = radius;
    }

    public double luas() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double keliling() {
        return 2 * Math.PI * radius;
    }
}

