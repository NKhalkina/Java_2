package HomeWork2;
/*  3) Напишите метод, который принимает на вход строку (String) и 
* определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите строку для определения, является ли она палиндромом: ");
        String str = scanner.nextLine(); 
        char[] array = str.toCharArray();
        int count = 0;
        boolean Boolean = true;
        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] == array[array.length - 1 - i])
                count++;
            }
        if(count == array.length / 2) {
            System.out.println(Boolean);
        } else {
            System.out.println(!Boolean);
        }
    }
}
