import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите номер задачи (для завершения программы введите 0): ");
            n = scanner.nextInt();
            switch (n) {
                case 0:
                    System.out.println("Программа завершена.");
                    break;
                case 1: {
                    //1.4
                    Fraction f1 = new Fraction();
                    Fraction f2 = new Fraction(-1, 4);
                    Fraction f3 = new Fraction(3, -27);
                    Fraction f4 = new Fraction(-2, -8);
                    Fraction f5 = new Fraction(5, 10);

                    System.out.println("f1 = " + f1);
                    System.out.println("f2 = " + f2);
                    System.out.println("f3 = " + f3);
                    System.out.println("f4 = " + f4);
                    System.out.println("f5 = " + f5);

                    // Сложение дробей
                    Fraction sumFraction = f1.sum(f5);
                    System.out.println(f1 + " + " + f5 + " = " + sumFraction);

                    // Сложение дроби и целого числа
                    Fraction sumNumber = f4.sum(2);
                    System.out.println(f4 + " + 2 = " + sumNumber);

                    // Вычитание дробей
                    Fraction diffFraction = f3.difference(f4);
                    System.out.println(f3 + " - " + f4 + " = " + diffFraction);

                    // Вычитание дроби и целого числа
                    Fraction diffNumber = f3.difference(7);
                    System.out.println(f3 + " - 7 = " + diffNumber);

                    // Умножение дробей
                    Fraction compFraction = f2.composition(f5);
                    System.out.println(f5 + " * " + f5 + " = " + compFraction);

                    // Умножение дроби и целого числа
                    Fraction compNumber = f4.composition(16);
                    System.out.println(f4 + " * 16 = " + compNumber);

                    // Деление дробей
                    Fraction divFraction = f5.division(f1);
                    System.out.println(f5 + " / " + f1 + " = " + divFraction);

                    // Деление дроби и целого числа
                    Fraction divNumber = f3.division(2);
                    System.out.println(f3 + " / 2 = " + divNumber);

                    try {
                        Fraction f6 = new Fraction(1, 0); //знаменатель 0
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }

                    try {
                        Fraction f7 = new Fraction(0, 1);
                        f1.division(f7); //деление на нулевую дробь
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }

                    try {
                        f2.division(0); //деление на 0
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }

                    try {
                        Fraction f8 = new Fraction(null); //передача дроби null в конструктор копирования
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }

                    //f1.setNumerator(5); //нет сеттеров, нельзя менять дробь
                    break;
                }

                case 2: {
                    //1.10
                    Roads cityA = new Roads();
                    Roads cityB = new Roads("B");

                    try {
                        Roads cityC = new Roads(""); //пустое название города
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                        System.out.println();
                    }

                    Roads cityC = new Roads("C");

                    cityA.addWay("B", 3);
                    cityA.addWay("C", 12);
                    cityC.addWay("A", 9);
                    cityC.addWay("B", 2);

                    Map<String, Integer> waysD = new HashMap<>();
                    waysD.put("A", 5);
                    waysD.put("C", 7);
                    Roads cityD = new Roads("D", waysD);

                    cityB.addWay("D", 6);

                    System.out.println("Карта дорог: ");
                    System.out.println(cityA);
                    System.out.println(cityB);
                    System.out.println(cityC);
                    System.out.println(cityD);
                    System.out.println();

                    try {
                        cityB.addWay("B", 4); //дорога в себя
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }

                    try {
                        cityD.addWay("A", 8); //дорога уже существует
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }

                    cityA.removeWay("C");
                    cityD.removeWay("A");

                    try {
                        cityB.removeWay("D"); //дороги не существует
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }

                    try {
                        cityB.addWay("D", -18); //некорректная стоимость
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                        System.out.println();
                    }

                    System.out.println("Изменённая карта дорог: ");
                    System.out.println(cityA);
                    System.out.println(cityB);
                    System.out.println(cityC);
                    System.out.println(cityD);
                    System.out.println();

                    try {
                        Map<String, Integer> waysE = new HashMap<>();
                        waysE.put("", 5); //в карте дорог путь с пустым названием города
                        waysE.put("C", 7);
                        Roads cityE = new Roads("E", waysE);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }

                    try {
                        Map<String, Integer> waysE = new HashMap<>();
                        waysE.put("A", 5);
                        waysE.put("C", -7); //в карте дорог путь с некорректной стоимостью
                        Roads cityE = new Roads("E", waysE);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                }

                case 3: {
                    //2.5
                    CreateCities cityA = new CreateCities("A");
                    CreateCities cityB = new CreateCities("B");
                    CreateCities cityC = new CreateCities("C");
                    CreateCities cityD = new CreateCities("D");
                    CreateCities cityE = new CreateCities("E");
                    CreateCities cityF = new CreateCities("F");

                    cityA.addCreateWay("B", 5);
                    cityA.addCreateWay("D", 6);
                    cityA.addCreateWay("F", 1);

                    cityB.addCreateWay("A", 5);
                    cityB.addCreateWay("C", 3);

                    cityC.addCreateWay("B", 3);
                    cityC.addCreateWay("D", 4);

                    cityD.addCreateWay("A", 6);
                    cityD.addCreateWay("C", 4);
                    cityD.addCreateWay("E", 2);

                    cityE.addCreateWay("F", 2);

                    cityF.addCreateWay("B", 1);
                    cityF.addCreateWay("E", 2);

                    Map<String, CreateCities> citiesMap = new HashMap<>();
                    citiesMap.put("A", cityA);
                    citiesMap.put("B", cityB);
                    citiesMap.put("C", cityC);
                    citiesMap.put("D", cityD);
                    citiesMap.put("E", cityE);
                    citiesMap.put("F", cityF);

                    Route route1 = new Route(cityF, cityD, citiesMap);
                    System.out.println(route1);
                    Route route2 = new Route(cityA, cityC, citiesMap);
                    System.out.println(route2);
                    Route route3 = new Route(cityE, cityC, citiesMap);
                    System.out.println(route3);
                    break;
                }

                case 4: {
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
                    break;
                }
                case 5: {
                    //4.2
                    FractionIsNumber f1 = new FractionIsNumber();
                    FractionIsNumber f2 = new FractionIsNumber(-200, -102);
                    FractionIsNumber f3 = new FractionIsNumber(-1, 4);
                    FractionIsNumber f4 = new FractionIsNumber(60, 8);
                    FractionIsNumber f5 = new FractionIsNumber(25, -10);

                    System.out.println("f1 = " + f1);
                    System.out.println("f2 = " + f2);
                    System.out.println("f3 = " + f3);
                    System.out.println("f4 = " + f4);
                    System.out.println("f5 = " + f5);

                    System.out.println("Преобразование типов:");
                    System.out.println("f2: " + f2.doubleValue() + " (doubleValue())");
                    System.out.println("f3: " + f3.floatValue() + " (floatValue())");
                    System.out.println("f4: " + f4.longValue() + " (longValue())");
                    System.out.println("f5: " + f5.intValue() + " (intValue())");
                    break;
                }

                case 6: {
                    //5.1
                    double sum1 = Addition.sum(
                            Addition.createInteger(2),
                            Addition.createFraction(3, 5),
                            Addition.createDouble(2.3));
                    double sum2 = Addition.sum(
                            Addition.createDouble(3.6),
                            Addition.createFraction(49, 12),
                            Addition.createInteger(3),
                            Addition.createFraction(3, 2));
                    double sum3 = Addition.sum(
                            Addition.createFraction(1, 3),
                            Addition.createInteger(1));

                    System.out.println("2 + 3/5 + 2.3 = " + sum1);
                    System.out.println("3.6 + 49/12 + 3 + 3/2 = " + sum2);
                    System.out.println("1/3 + 1 = " + sum3);
                    break;
                }

                case 7: {
                    //6.5
                    Map<String, Integer> ways = new HashMap<>();
                    ways.put("B", 5);
                    ways.put("C", 3);

                    ComparisonCities A1 = new ComparisonCities("A1", ways);
                    TwoWayRoad A2 = new TwoWayRoad("A2", ways);
                    Roads A3 = new Roads("A3", ways);

                    System.out.println("A1 (ComparisonCities) equals A2 (TwoWayRoad): " + A1.equals(A2));
                    System.out.println("A1 (ComparisonCities) equals A3 (Roads): " + A1.equals(A3));
                    System.out.println("A1.hashCode(): " + A1.hashCode());
                    System.out.println("A2.hashCode(): " + A2.hashCode());
                    System.out.println("A3.hashCode(): " + A3.hashCode());

                    A2.addTwoWayRoad(new TwoWayRoad("D"), 7);
                    A3.addWay("D", 7);

                    System.out.println("A1 (ComparisonCities) equals A2 (TwoWayRoad): " + A1.equals(A2));
                    System.out.println("A1 (ComparisonCities) equals A3 (Roads): " + A1.equals(A3));
                    System.out.println("A1.hashCode(): " + A1.hashCode());
                    System.out.println("A2.hashCode(): " + A2.hashCode());
                    System.out.println("A3.hashCode(): " + A3.hashCode());
                    break;
                }

                default:
                    System.out.println("Ошибка. Введён несуществующий номер задачи.");
                    break;
            }
        } while (n != 0);
    }
}