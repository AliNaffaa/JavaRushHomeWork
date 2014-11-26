package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());
        int four = Integer.parseInt(reader.readLine());
        int c = getMax(getMax(first, second), getMax(third, four));


        System.out.println(c);


    }

    private static int getMax(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }

    private static int getMin(int a, int b)
    {
        if (a < b)
            return a;
        else
            return b;
    }

    }

