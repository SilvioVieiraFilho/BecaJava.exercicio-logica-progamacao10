package Exercicio;

import java.util.Scanner;

public class Exercicio10 {

	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	Scanner s = new Scanner(System.in);

	int soma = b + c;
	int soma2 = a + b;
	int soma3 = c + a;

	public void triangulo() {

		System.out.println("Digite letra A:");
		a = s.nextInt();
		System.out.println("Digite letra B:");
		b = s.nextInt();
		System.out.println("Digite letra C:");
		c = s.nextInt();

		soma = b + c;

		if (a < soma || b < soma3 || c < soma2) {

			System.out.println("é um triangulo");

		} else
		{

			System.out.println(" nao é um triangulo");

		}

	}

}
