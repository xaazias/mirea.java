package ru.mirea.java.task12;

enum Planet {

    MERCURY(3.33 * Math.pow(10, 23),2439),
    VENUS(4.86 * Math.pow(10, 24),6051),
    EARTH(5.97 * Math.pow(10, 24), 6371),
    MARS(6.39 * Math.pow(10, 23),3389),
    JUPITER(1.89 * Math.pow(10, 27),69911),
    SATURN(5.68 * Math.pow(10, 26),58232),
    URANUS(8.68 * Math.pow(10, 25),25362),
    NEPTUNE(1.02 * Math.pow(10, 26), 24622);

    double mass, radius; // kg, km

    Planet(double m, double r) {
        this.mass = m;
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    public double getGravity() {
        return (double) Math.round((6.6720 * Math.pow(10, -11) * mass / Math.pow(radius * 1000, 2)) * 100) / 100;
    }
}
