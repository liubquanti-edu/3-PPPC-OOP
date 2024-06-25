package test;

import domain.Exercise;

/**
 * Клас TestResult демонструє результат виконання методу Calculate.
 */
public class TestResult {
    public static void main(String[] args) {
        int luckyTicketsCount = Exercise.Calculate();
        System.out.println("Кількість щасливих квитків: " + luckyTicketsCount);
    }
}
