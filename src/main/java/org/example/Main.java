package org.example;

import java.util.Scanner;

public class Main {
    // Объявления переменных
    public static int a, b, c;
    public static void main(String[] args) {
        // Просим пользователя ввести данные
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные треугольника:");
        System.out.print("Введите a: ");
        a = sc.nextInt();
        System.out.print("Введите b: ");
        b = sc.nextInt();
        System.out.print("Введите c: ");
        c = sc.nextInt();
        // Условия, в зависимости от которых выводится сообщение
        if(ConditionPythagor(a,b,c)){// Теорема пифагора
            System.out.println("a, b и c являются сторонами прямоугольного треугольника");
        }else if (ConditionRectangular(a, b, c)) {// Равносторонний треугольника
            System.out.println("a, b и c являются сторонами равностороннего треугольника");
        }else if (ConditionIsosceles(a, b, c)) {// Равнобедренный треугольник
            System.out.println("a, b и c являются сторонами равнобедренного треугольника");
        }else if (ConditionInequality(a, b, c)) {// Вообще не треугольник
            System.out.println("a, b и c не являются сторонами треугольника");
        } else{// В ином случае это обычный треугольник
            System.out.println("a, b и c являются сторонами обычного треугольника");
        }
    }
    // Возвращает true, если соответствует теореме пифагора
    public static boolean ConditionPythagor(int a, int b, int c) {
        return a * a + b * b == c * c || c * c + a * a == b * b;
    }
    // Возвращает true, если равнобедренный треугольник
    public static boolean ConditionIsosceles(int a, int b, int c){
        return a == b || b == c || c == a;
    }
    // Возвращает true, если равносторонний треугольник
    public static boolean ConditionRectangular(int a, int b, int c){
        return a == b && b == c;
    }
    // Возвращает true, если не является трегольником
    public static boolean ConditionInequality(int a, int b, int c){
        return a + b <= c || b + c <= a || c + a <= b;
    }
}