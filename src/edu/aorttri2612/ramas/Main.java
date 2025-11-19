package edu.aorttri2612.ramas;

import java.util.HashSet;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		HashSet<Integer> bolas = new HashSet<>();
		Random r = new Random();

		while (bolas.size() < 5) {
			bolas.add(r.nextInt(49) + 1);
		}

		System.out.println("Números principales: " + bolas);

		int complementario = r.nextInt(49) + 1;
		System.out.println("Complementario: " + complementario);

		int suma = bolas.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Suma de principales: " + suma);

		System.out.println("¡Suerte en el sorteo, DAM!");
	}
}