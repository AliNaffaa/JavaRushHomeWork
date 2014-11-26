package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());
        int max = getMax(getMax(first, second), getMax(second, third));
        int min = getMin(getMin(first, second), getMin(second, third));
        System.out.println((first+second+third)-(max+min));
    }

    static int getMax(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }
    static int getMin(int a, int b)
    {
        if (a < b)
            return a;
        else
            return b;
    }
}
