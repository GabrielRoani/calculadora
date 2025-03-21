package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação a ser feita: 1 = Soma, 2 = Subtração, 3 = Divisão, 4 = Multiplicação");
            int operacao = scanner.nextInt();

            if (operacao < 1 || operacao > 4) {
                System.out.println("Por favor digite um comando válido");
                continue;
            }
            System.out.println("Diga o primeiro número");
            int numero1 = scanner.nextInt();

            System.out.println("Diga o segundo número");
            int numero2 = scanner.nextInt();

                if (operacao == 1) {
                    System.out.println("o resultado de sua conta é:" + numero1 + "+" + numero2 + "=" + (numero1 + numero2));
                } else if (operacao == 2) {
                    System.out.println("o resultado de sua conta é:" + numero1 + "-" + numero2 + "=" + (numero1 - numero2));
                } else if (numero1 == 0 || numero2 == 0 && operacao == 3 || operacao == 4) {
                    System.out.println("Operação com 0 impossivel");
                } else if (operacao == 3 || operacao == 4) {
                    System.out.println();
                } else if (numero1 == 0 || numero2 == 0 && operacao == 3 || operacao == 4) {
                    System.out.println("Operação com 0 impossivel");
                } else if (operacao == 3) {
                    System.out.println("o resultado de sua conta é:" + numero1 + "/" + numero2 + "=" + (numero1 / numero2));
                } else {
                    System.out.println("o resultado de sua conta é:" + numero1 + "x" + numero2 + "=" + (numero1 * numero2));
                }
            }
        }
    }
