package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int c = getMax(getMax(first, second), getMax(second, third));
        int a = getMin(getMin(first, second), getMin(second, third));
        int b = (first+second+third)-(c+a);

        System.out.println(c + " " + b + " " + a);


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

