import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //1.4
//        Fraction f1 = new Fraction();
//        Fraction f2 = new Fraction(-1, 4);
//        Fraction f3 = new Fraction(3, -27);
//        Fraction f4 = new Fraction(-2, -8);
//        Fraction f5 = new Fraction(5,10);
//
//        System.out.println("f1 = " + f1);
//        System.out.println("f2 = " + f2);
//        System.out.println("f3 = " + f3);
//        System.out.println("f4 = " + f4);
//        System.out.println("f5 = " + f5);
//
//        // Сложение дробей
//        Fraction sumFraction = f1.sum(f5);
//        System.out.println(f1 + " + " + f5 + " = " + sumFraction);
//
//        // Сложение дроби и целого числа
//        Fraction sumNumber = f4.sum(2);
//        System.out.println(f4 + " + 2 = " + sumNumber);
//
//        // Вычитание дробей
//        Fraction diffFraction = f3.difference(f4);
//        System.out.println(f3 + " - " + f4 + " = " + diffFraction);
//
//        // Вычитание дроби и целого числа
//        Fraction diffNumber = f3.difference(7);
//        System.out.println(f3 + " - 7 = " + diffNumber);
//
//        // Умножение дробей
//        Fraction compFraction = f2.composition(f5);
//        System.out.println(f5 + " * " + f5 + " = " + compFraction);
//
//        // Умножение дроби и целого числа
//        Fraction compNumber = f4.composition(16);
//        System.out.println(f4 + " * 16 = " + compNumber);
//
//        // Деление дробей
//        Fraction divFraction = f5.division(f1);
//        System.out.println(f5 + " / " + f1 + " = " + divFraction);
//
//        // Деление дроби и целого числа
//        Fraction divNumber = f3.division(2);
//        System.out.println(f3 + " / 2 = " + divNumber);
//
//        try {
//            Fraction f6 = new Fraction(1, 0);
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//        try {
//            Fraction f7 = new Fraction(0, 1);
//            f1.division(f7);
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//        try {
//            f2.division(0);
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//        try {
//            Fraction f8 = new Fraction(null);
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }

//        //f1.setNumerator(5); //нет сеттеров, нельзя менять дробь

//        //1.10
//        Roads cityA = new Roads();
//        Roads cityB = new Roads("B");
//
//        try {
//            Roads cityC = new Roads(""); //пустое название города
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//            System.out.println();
//        }
//
//        Roads cityC = new Roads("C");
//
//        cityA.addWay("B", 3);
//        cityA.addWay("C", 12);
//        cityC.addWay("A", 9);
//        cityC.addWay("B", 2);
//
//        Map<String, Integer> waysD = new HashMap<>();
//        waysD.put("A", 5);
//        waysD.put("C", 7);
//        Roads cityD = new Roads("D", waysD);
//
//        cityB.addWay("D", 6);
//
//        System.out.println("Карта дорог: ");
//        System.out.println(cityA);
//        System.out.println(cityB);
//        System.out.println(cityC);
//        System.out.println(cityD);
//        System.out.println();
//
//        try {
//            cityB.addWay("B", 4); //дорога в себя
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//        try {
//            cityD.addWay("A", 8); //дорога уже существует
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//        cityA.removeWay("C");
//        cityD.removeWay("A");
//
//        try {
//            cityB.removeWay("D"); //дороги не существует
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//        try {
//            cityB.addWay("D", -18); //некорректная стоимость
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//            System.out.println();
//        }
//
//        System.out.println("Изменённая карта дорог: ");
//        System.out.println(cityA);
//        System.out.println(cityB);
//        System.out.println(cityC);
//        System.out.println(cityD);
//        System.out.println();
//
//        try {
//            Map<String, Integer> waysE = new HashMap<>();
//            waysE.put("", 5); //в карте дорог путь с пустым названием города
//            waysE.put("C", 7);
//            Roads cityE = new Roads("E", waysE);
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//        try {
//            Map<String, Integer> waysE = new HashMap<>();
//            waysE.put("A", 5);
//            waysE.put("C", -7); //в карте дорог путь с некорректной стоимостью
//            Roads cityE = new Roads("E", waysE);
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }

        //2.5

        //3.1
        ForbiddenFraction f1 = ForbiddenFraction.create();
        ForbiddenFraction f2 = ForbiddenFraction.create(-1, 4);
        ForbiddenFraction f3 = ForbiddenFraction.create(3, -27);
        ForbiddenFraction f4 = ForbiddenFraction.create(-2, -8);
        ForbiddenFraction f5 = ForbiddenFraction.create(5,10);

        //ForbiddenFraction f5 = new ForbiddenFraction.create(5,10); //использование new для статического метода
        //ForbiddenFraction f5 = new ForbiddenFraction(5,10); //конструкторы приватные

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);

        // Сложение дробей
        ForbiddenFraction sumFraction = f1.sum(f5);
        System.out.println(f1 + " + " + f5 + " = " + sumFraction);

        // Сложение дроби и целого числа
        ForbiddenFraction sumNumber = f4.sum(2);
        System.out.println(f4 + " + 2 = " + sumNumber);

        // Вычитание дробей
        ForbiddenFraction diffFraction = f3.difference(f4);
        System.out.println(f3 + " - " + f4 + " = " + diffFraction);

        // Вычитание дроби и целого числа
        ForbiddenFraction diffNumber = f3.difference(7);
        System.out.println(f3 + " - 7 = " + diffNumber);

        // Умножение дробей
        ForbiddenFraction compFraction = f2.composition(f5);
        System.out.println(f5 + " * " + f5 + " = " + compFraction);

        // Умножение дроби и целого числа
        ForbiddenFraction compNumber = f4.composition(16);
        System.out.println(f4 + " * 16 = " + compNumber);

        // Деление дробей
        ForbiddenFraction divFraction = f5.division(f1);
        System.out.println(f5 + " / " + f1 + " = " + divFraction);

        // Деление дроби и целого числа
        ForbiddenFraction divNumber = f3.division(2);
        System.out.println(f3 + " / 2 = " + divNumber);


        //class Class extends ForbiddenFraction  //final запрещает
        //f1.setNumerator(5); //нет сеттеров, нельзя менять дробь
    }
}