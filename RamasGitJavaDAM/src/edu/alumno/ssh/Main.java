package edu.alumno.ssh;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("Números de la Lotería Primitiva:");

		int[] numeros = new int[6];
		int contador = 0;

		while (contador < 6) {
			int numero = random.nextInt(49) + 1; // genera número entre 1 y 49

			// Comprobar si el número ya fue generado
			boolean repetido = false;
			for (int i = 0; i < contador; i++) {
				if (numeros[i] == numero) {
					repetido = true;
					break;
				}
			}

			// Si no está repetido, lo guardamos
			if (!repetido) {
				numeros[contador] = numero;
				contador++;
			}
		}

		// Mostrar los números principales
		System.out.print("Números principales: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(numeros[i] + (i < 5 ? ", " : ""));
		}
		System.out.println();

		// Generar el número complementario (que no se repita)
		int complementario;
		do {
			complementario = random.nextInt(49) + 1;
		} while (estaRepetido(numeros, complementario));

		System.out.println("Número complementario: " + complementario);
		System.out.println("¡Buena suerte en el sorteo!");
	}

	// Método auxiliar para comprobar si un número ya fue generado
	public static boolean estaRepetido(int[] numeros, int numero) {
		for (int n : numeros) {
			if (n == numero) {
				return true;
			}
		}
		return false;
	}
}
