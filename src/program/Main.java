package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Numeros;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n, numerosPares;


        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();


        Numeros[] numeros = new Numeros[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero: ");
            int numero = sc.nextInt();
            numeros[i] = new Numeros(numero);
        }

        numerosPares = 0;
        ArrayList<Integer> numerosExibidos = new ArrayList<>();
        for (Numeros numero : numeros) {
            if (numero.getNumero() % 2 == 0) {
                numerosPares++;
                numerosExibidos.add(numero.getNumero());
            }

        }
        System.out.println("NUMEROS PARES: " + numerosExibidos);
        System.out.println("QUANTIDADE DE NUMEROS PARES: " + numerosPares);

    }
}