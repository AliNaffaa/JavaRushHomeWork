package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int num1= Integer.parseInt(reader.readLine());
        int num2= Integer.parseInt(reader.readLine());
        int num3= Integer.parseInt(reader.readLine());
        int num4= Integer.parseInt(reader.readLine());
        int num5= Integer.parseInt(reader.readLine());

       Integer [] list = {num1,num2,num3,num4,num5};
        Arrays.sort(list);
        for(int value :list)
            System.out.println(value);
    }
}
