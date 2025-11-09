package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;
        int n = sc.nextInt();
        Person[] vect = new Person[n];

        for (int i = 0; i < n; i++){
            String name = sc.next();
            int age = sc.nextInt();
            double heigth = sc.nextDouble();
            vect[i] = new Person(name, age, heigth);
            soma += vect[i].getHeigth();
        }

        System.out.printf("Média de altura: %.2f%n", Person.media(soma, vect.length));
        Person.percentage(vect);

        sc.close();
    }
}
