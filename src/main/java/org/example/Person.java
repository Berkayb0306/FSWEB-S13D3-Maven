package org.example;

public class Person {
    public String name;
    public String lastName;
    public int age;
    public double height;
    public double weight;
    public String eyeColor;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String name, String lastName, int age, double height, double weight, String eyeColor) {
        this(name, lastName, age);
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age > 13 && age < 19;

    }

    public static void main(String[] args) {
        Person person1 = new Person("Berkay","Soysal",25);
        Person person2 = new Person("Berkay","Soysal",25);
        Person person3 = new Person("Berkay","Soysal",25);
        System.out.println(person1.getName() + " adlı kişinin soyadı " + person1.getLastName() + " soyadlı kişinin yaşı :"+ person1.getAge() +" ve bu kişi " + (person1.isTeen() ? "ergen":"ergen değil")) ;
    }
}