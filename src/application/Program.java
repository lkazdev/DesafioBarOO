package application;
import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bill = new Bill();

		System.out.printf("Sexo: ");
		bill.setGender(sc.next().charAt(0));
		System.out.printf("Quantidade de cervejas: ");
		bill.setBeer(sc.nextInt());
		System.out.printf("Quantidade de refrigerantes: ");
		bill.setSoftDrink(sc.nextInt());
		System.out.printf("Quantidade de espetinhos: ");
		bill.setBarbecue(sc.nextInt());

		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
		if (bill.cover() == 0.0) {
			System.out.println("Isento de Couvert");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", bill.cover());
		}
		System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
		System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());


		sc.close();

	}
}
