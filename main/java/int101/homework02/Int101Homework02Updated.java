package int101.homework02;

import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {
    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }
    static void work01Utilitor() {
        //testString
        System.out.println(Utilitor.testString("Hello world"));
        //System.out.println(Utilitor.testString(""));
        //testPositive
        System.out.println(Utilitor.testPositive(10));
        //System.out.println(Utilitor.testPositive(-1));
        //testIsbn10
        System.out.println("Isbn10: " + Utilitor.computeIsbn10(974472362));
        System.out.println("-----------------------------------------------------");
    }
    static void work02Person() {
        //objectOne//
        Person p1 = new Person("Hello","World");
        //testGetter
        System.out.println(p1);
        System.out.println("Id: " + p1.getId());
        System.out.println("Firstname: " + p1.getFirstname());
        System.out.println("lastname: " + p1.getLastname());
        //testSetter
        p1.setFirstname("Sushi");
        System.out.println(p1);
        System.out.println();
        //testEquals

        //objectTwo//
        Person p2 = new Person("Hello","Java");
        //testGetter
        System.out.println(p2);
        System.out.println("Id: " + p2.getId());
        System.out.println("Firstname: " + p2.getFirstname());
        System.out.println("lastname: " + p2.getLastname());
        //testSetter
        p2.setFirstname("MamaTomyumkung");
        System.out.println(p2);
        //testEquals
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("-----------------------------------------------------");
    }
    static void work03Account() {
        Person person1 = new Person("John", "Smith");
        Account bank1 = new Account(person1);
        Person person2 = new Person("Alice", "Eiei");
        Account bank2 = new Account(person2);

        //bank1
        System.out.println("Bank1 Deposit: " + bank1.deposit(100000));
        System.out.println("Bank1 Withdraw: " + bank1.withdraw(50000));
        //bank1 transfer bank2
        bank1.transfer(10000,bank2);
        System.out.println("Bank1: " + bank1);
        System.out.println("-----------------------------------------------------");

        //bank2
        System.out.println("Bank2 Deposit: " + bank2.deposit(200000));
        System.out.println("Bank2 Withdraw: " + bank2.withdraw(200000));
        System.out.println("Bank2: " + bank2);
    }
}

