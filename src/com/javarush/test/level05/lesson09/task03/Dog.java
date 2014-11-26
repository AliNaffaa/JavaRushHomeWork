package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    String рост;
    String цвет;

    public Dog(String name)
    {
        this.name = name;

    }

    public Dog(String name, String рост)
    {
        this.name = name;
        this.рост = рост;

    }

    public Dog(String name, String рост, String цвет)
    {
        this.name = name;
        this.рост = рост;
        this.цвет = цвет;

    }

}
