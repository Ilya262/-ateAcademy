package Lesson12_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Material> material = new ArrayList<Material>();

		menu();
		for (Material materials : Material.values()) {
			material.add(materials);

		}
		while (true) {
			switch (sc.nextInt()) {

			case 1: {

				List auto = new ArrayList();

				for (int i = 0; i < random(1, 10); i++) {
					for (int j = 0; j < random(1, 10); j++) {

						auto.add(new Car(random(1, 15), random(2004, 2020), new Helm(random(1, 15)),
								new Motor(random(1, 15)), material.get(random(0, 1))));

					}

				}

				System.out.println(auto);

				break;
			}

			case 2: {
				List  auto1 = new ArrayList();
				 auto1.add(new Car(random(10, 15), random(2004, 2020), new Helm(random(10, 15)),
						new Motor(random(1, 15)), material.get(random(0, 1))));
				List array = new ArrayList();
				
				array.addAll(auto1);
				System.out.println(array);

			}
				break;
			}
		}

	}

	private static Motor[] material() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int random(int min, int max) {

		if (min > max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}
		Random random = new Random();

		return random.nextInt(max - min + 1) + min;
	}

	public static void menu() {
		System.out.println("Вивести toString() даних елементів масиву на консоль");
		System.out.println("Для всіх обєктів даного масиву засетити одинаковий  обєкт класу Авто");
	}

}
