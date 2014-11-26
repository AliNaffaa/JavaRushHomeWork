package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scaner = new Scanner(System.in);
        String name1 = scaner.nextLine();
        String name2 = scaner.nextLine();
        String name3 = scaner.nextLine();

        System.out.print(name1+" + "+name2+" + "+name3+" Чистая любовь, да-да!");

    }
}