package com.javarush.test.level03.lesson08.task04;

/* Спонсор - это звучит гордо
Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.
Пример:
Коля проспонсировал Лену, и она стала известной певицей.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scaner = new Scanner(System.in);
        String name1 = scaner.nextLine();
        String name2 = scaner.nextLine();

        System.out.print(name1+" проспонисировал "+name2+", и она стала известной певицей.");

    }
}