package com.Edward;

public class Main {

    public static void main(String[] args) {
	// Call the both the interface class and call dog
//        Mammal m = new Mammal();
//        Dog d = new Dog();
//        System.out.println("Instance of a class Animal" +m);
//        System.out.println(" Instance of a class Mammal" + d);
//
//       System.out.println("Instance of the class Mammal" +d);

//        Subclass s = new Subclass();
//        s.printMethod();
        Mammal mm = new Mammal();
        mm.walk();
        Dog dd = new Dog();
        dd.eat();

    }
}
