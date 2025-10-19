package ru.sivkova.geometry;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }
    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Point)) {
            return false;
        }
        Point point = (Point) object;
        if (this.x == point.x && this.y == point.y)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    protected Point clone() {
        return new Point(this);
    }
}

