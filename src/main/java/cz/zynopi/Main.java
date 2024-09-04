package cz.zynopi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        String zprava;
        int i = 0;

        System.out.print("Zde napiš, jakou zprávu chceš vypsat stokrát: ");
        zprava = vstup.nextLine();

        while(i < 100) {
            i++;
            System.out.println(i + ". " + zprava);
        }
    }
}

