package entities;

public class Person {

    private String name;
    private int age;
    private double heigth;
    
    public Person(String name, int age, double heigth){
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public static double media(double soma, int quantidade){
        double media = soma / quantidade;
        return media;
    }

    public static void percentage(Person[] vect){
        int minor = 0;
        int above = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i].age < 16) {
                minor += 1;
            }
            else{
                above += 1;
            }
        }
        double percentageminor = ((double) minor / vect.length) * 100.0;
        double percentagemabove = ((double) above / vect.length) * 100.0;
        System.out.printf("Pessoas com menos de 16: %.1f%%n", percentageminor);
        for (int i = 0; i < vect.length; i++){
            if (vect[i].age < 16) {
                System.out.println(vect[i].name);
            }
        }
        System.out.printf("Pessoas com mais de 16: %.1f%%n", percentagemabove);
        for (int i = 0; i < vect.length; i++){
            if (vect[i].age > 16) {
                System.out.println(vect[i].name);
            }
        }
    }
}


