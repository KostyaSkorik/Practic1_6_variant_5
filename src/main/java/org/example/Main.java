package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Practical task 1.6, Student Skorik Konstantin, RIBO-05-22, Variant 5");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scan.next();

        Store store= new Store(name);
        Revizor revizor = new Revizor("Kostya");
        System.out.println(store.toString());

        revizor.closeStore(store);
        System.out.println(store.toString());

        revizor.rebrand(store);
        System.out.println(store.toString());
    }
}