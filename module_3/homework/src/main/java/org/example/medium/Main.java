package org.example.medium;

public class Main {

    public static void main(String[] args) {
        /*
        BankAccount acc = new BankAccount("4400 4312 1111 1111", 500);
        System.out.println(acc.getBalance());
        acc.deposit(400);
        System.out.println(acc.getBalance());
        acc.withdraw(700);
        System.out.println(acc.getBalance());
        acc.withdraw(300);
        acc.withdraw(300);
        System.out.println(acc.getBalance());
        */

        Animal cat = new Cat("cat");
        Animal dog = new Dog("dog");
        Animal cow = new Cow("cow");
        Animal horse = new Horse("horse");

        Meat meat = new Meat();
        Grass grass = new Grass();
        cat.eat(meat);
        cat.eat(grass);
        dog.eat(meat);
        dog.eat(grass);
        cow.eat(meat);
        cow.eat(grass);
        horse.eat(meat);
        horse.eat(grass);

    }
}
