package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{



    public static class Man{
        static String name;
        static int age;
        static String address;
        public Man(){
           this.name = "realMen";
           this.age = 24;
           this.address = "Paskot";
        }
        public Man(String name){
            this.name = name;
            this.age = 24;
            this.address = "Paskot";
        }
        public Man(int age){
            this.name = "realMen";
            this.age = age;
            this.address = "Paskot";
        }
        public Man(String name,int age,String adress){
            this.name = name;
            this.age = age;
            this.address = adress;
        }
    }

    public static class Woman{
        static String name;
        static int age;
        static String address;
        public Woman(){
            this.name = "chika";
            this.age = 18;
            this.address = "Paskot";
        }
        public Woman(String name){
            this.name = name;
            this.age = 18;
            this.address = "Paskot";
        }
        public Woman(int age){
            this.name = "chika";
            this.age = age;
            this.address = "Paskot";
        }
        public Woman(String name,int age,String adress){
            this.name = name;
            this.age = age;
            this.address = adress;
        }
    }


    public static void main(String[] args)
    {
        Man man = new Man("RealMen", 24, "Las Vegas");
        Woman woman = new Woman("kiska", 18, "Las Vegas");
        System.out.println(man.name+" "+man.age+" "+man.address);
        System.out.println(woman.name+" "+woman.age+" "+woman.address);
        //5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
    }


}
