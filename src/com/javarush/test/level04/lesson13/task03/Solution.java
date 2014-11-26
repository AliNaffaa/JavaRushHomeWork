package com.javarush.test.level04.lesson13.task03;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int symbol = 8;
       String text = symbol+"";
       for(int counter = 0;counter<10;counter++){
           System.out.println(text);
           text = text+symbol;
              }

    }
}
