package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int width;
    String color;

    public void initialize(String name)
    {
        this.name = name;

    }

    public void initialize(String name, int width)
    {
        this.name = name;
        this.width = width;

    }

    public void initialize(String name, int width, String color)
    {
        this.name = name;
        this.width = width;
        this.color = color;
    }
}
