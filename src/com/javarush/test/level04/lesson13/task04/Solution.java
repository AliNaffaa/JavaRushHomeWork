package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for(int counter = 1;counter<=10;counter++){
            if(counter==1){
                System.out.println("8888888888");
                System.out.println("\n");
            }

            else
              System.out.println("8");
        }
        System.out.println("8");
    }
}
