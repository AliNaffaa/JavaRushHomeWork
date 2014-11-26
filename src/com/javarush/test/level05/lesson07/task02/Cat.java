package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, width, age
- Имя, age (width стандартный)
- width, цвет, (имя, адрес и age неизвестны, это бездомный кот)
- width, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если width неизвестен, то нужно указать какой-нибудь средний width. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name = null;
    int width;
    int age;
    String color;
    String adress;

    public void initialize(String name)
    {
        this.name = name;
        this.width = 3;
        this.age = 4;
        this.adress = null;
    }

    public void initialize(String name, int width, int age)
    {
        this.name = name;
        this.width = width;
        this.age = age;
        this.adress = null;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.width = 3;
        this.adress = null;
    }

    public void initialize(int width, String color)
    {
        this.name = null;
        this.color = color;
        this.width = width;
        this.adress = null;
        this.age = 4;

    }

    public void initialize(int width, String color, String adress)
    {
        this.color = color;
        this.width = width;
        this.adress = adress;
        this.age = 4;

    }


}
