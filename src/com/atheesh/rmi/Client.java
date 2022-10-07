package com.atheesh.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    private Client () {}
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a = ");
        var a = scanner.nextInt();
        System.out.println("Введите b = ");
        var b = scanner.nextInt();
        System.out.println("Введите c = ");
        var c = scanner.nextInt();

        try {
            // Getting the registry
            Registry registry = LocateRegistry.getRegistry(null);
            // Looking up the registry for the remote object
            Raschet stub = (Raschet) registry.lookup("Raschet");
            System.out.println(stub.rasch(a,b,c));
        } catch (Exception e) {
            System.err.println("Client exeption: " + e.toString());
            e.printStackTrace();
        }
    }
}
