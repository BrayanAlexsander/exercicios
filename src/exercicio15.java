//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
// referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:


import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto guanha por horas trabalhado ?:");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Quantas Horas trabalhou no mes?: ");
        double horasMensal = scanner.nextDouble();
        double salario = horasTrabalhadas * horasMensal;

        System.out.println("Seu salario mensal é: " + salario);

        double impostoRenda = salario * 0.11;

        double inss = salario * 0.08;

        double sindicato = salario * 0.05;

        double salarioBruto = salario - impostoRenda - inss - sindicato;

        System.out.println("Salario Bruto é:" + salarioBruto);
        System.out.println("Pagou " + inss + " de Inss");
        System.out.println("Pagou " + impostoRenda + " de imposto de renda");
        System.out.println("Pagou " + sindicato + " para o sindicato");

    }
}
