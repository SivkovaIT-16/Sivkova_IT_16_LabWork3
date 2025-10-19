package ru.sivkova.geometry;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(-8.1, 3.0);
        Point clone = point1.clone();
        Point point2 = new Point(2, 9);

        System.out.println("Объект point1: " + point1);
        System.out.println("Объект clone: " + clone);
        System.out.println("Объект point2: " + point2);

        System.out.println("point1 equals clone: " + point1.equals(clone));
        System.out.println("point2 equals clone: " + point2.equals(clone));

        System.out.println("Хэш-код point1: " + point1.hashCode());
        System.out.println("Хэш-код clone: " + clone.hashCode());
        System.out.println("Хэш-код point2: " + point2.hashCode());
    }
}
