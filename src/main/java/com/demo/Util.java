package com.demo;

public class Util {

    private Util() {

    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static double computeCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
