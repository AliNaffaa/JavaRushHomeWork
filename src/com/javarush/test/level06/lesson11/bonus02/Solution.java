package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFather = reader.readLine();
        Cat grandFathe = new Cat(grandFather);

        String grandMother = reader.readLine();
        Cat grandMothe = new Cat(grandMother);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,grandFathe);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,grandMothe,null);

        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName,catMother,catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother,catFather);



        System.out.println(grandFathe);
        System.out.println(grandMothe);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent)
        {
            this.name = name;
            this.parentMother = parent;
        }
        Cat(String name, Cat parentMother,Cat parentFather)
        {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString()
        {
            if (parentMother == null&&parentFather == null)
                return "Cat name is " + name + ", no mother, no father";
            else if(parentFather == null&&(!(parentMother == null)))
                return "Cat name is " + name + ", mother is " + parentMother.name+ ", " + "no father";
            else if(parentMother == null&&(!(parentFather == null)))
                return "Cat name is " + name + ", no mother, father is " + parentFather.name;
            else
                return "Cat name is " + name + ", mother is " + parentMother.name+ ", father is " + parentFather.name;
        }



    }

}
