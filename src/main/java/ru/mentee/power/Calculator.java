package ru.mentee.power;



    public class Calculator {

        // Сложение
        public int add(int a, int b) {
            return a + b;
        }

        // Вычитание
        public int subtract(int a, int b) {
            return a - b;
        }

        // Умножение
        public int multiply(int a, int b) {
            return a * b;
        }

        // Деление (с проверкой на ноль)
        public double divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Деление на ноль!");
            }
            return (double) a / b;
        }
    }

