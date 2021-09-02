package exercicio;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor de a: ");
		int a = scanner.nextInt();

		System.out.print("Digite o valor de b: ");
		int b = scanner.nextInt();

		System.out.println("a + b = " + (a + b));

		scanner.close();
	}
}
