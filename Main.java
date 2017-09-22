package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner at = new Scanner(System.in);
        System.out.println("Frase: ");
        String frase = at.nextLine();

        int counter = 0;
        int o = 0;

        for (int i = 0; i < frase.length(); i++) {

            char pt = frase.charAt(i);

            if(pt == 'a' || pt == 'e' || pt == 'i' || pt == 'o' || pt =='u'){
                counter++;
            }
            if (pt == 'o'){o++;}


        }

        System.out.println("Tiene "+ counter +" vocales y tiene "+ o +" os");





    }
}
