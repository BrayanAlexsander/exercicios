package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o peso do peixe ?");
        double pesoPeixe = scanner.nextDouble();

        double execessoPeso = pesoPeixe - 50;
        double taxa = execessoPeso * 4;

        System.out.println("Voce tomou " + taxa + " de multa: ");
        System.out.println("Voce nao passou do limite de peso: " + pesoPeixe);

    }
}
