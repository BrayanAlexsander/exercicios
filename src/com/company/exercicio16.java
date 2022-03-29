//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,
// que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.


package com.company;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("qual e o tamanho da area  que vai ser utilizada ?: ");
        double areaQuadrado = scanner.nextDouble();

        double tintaMaior = 80;
        double tinta = areaQuadrado / 3 ;
        double quantidadeTinta = tinta / 18;
        double duasTintas = tintaMaior * quantidadeTinta;



        System.out.println("voce vai usar " + tinta + " metros de tinta ");
        System.out.println("valor da tinta é: " + tintaMaior + "$");
        System.out.println("Voce vai pagar "+ duasTintas + " por 2 Galao");
    }

}
