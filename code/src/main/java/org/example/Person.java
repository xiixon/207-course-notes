package org.example;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person p = new Person("Alice Aardvark", 1);
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p);

        Person p2 = new Person("Alice Aardvark", 1);
        System.out.println(p2 == p);
        System.out.println(p2.equals(p));
    }

    @Override
    public String toString() {
        return this.name + " (age:" + age + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj; // casting
        return other.name.equals(name) && other.age == age; // this.name == name, same string might be two different objects but int, bool, char can use == safely
    }
}