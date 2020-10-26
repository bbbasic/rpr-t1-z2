package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = ulaz.nextInt();

        System.out.println("Brojevi dijeljivi sa sumom svojih cifara su: ");
        for(int i = 1; i <= broj; i++) {
            if(i % sumaCifara(i) == 0) System.out.println(i);
        }

        //System.out.println("Unijeli ste: " + broj);
    }

    private static int sumaCifara(int i) {
        int suma = 0;
        while(i != 0) {
            suma = suma + i % 10;
            i = i / 10;
        }
        return suma;
    }
}
