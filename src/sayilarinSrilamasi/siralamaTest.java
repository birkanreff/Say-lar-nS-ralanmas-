package sayilarinSrilamasi;

import java.util.Scanner;

public class siralamaTest {

	public static void main(String[] args) {
		
		System.out.println("Sayıların sıralaması programına hoşgeldiniz!");
		System.out.println("-------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci sayıyı giriniz: ");
		int a = scanner.nextInt();
		
		System.out.println("İkinci sayıyı giriniz: ");
		int b = scanner.nextInt();
		
		System.out.println("Üçüncü sayıyı giriniz: ");
		int c = scanner.nextInt();
		
		if ( (a<b) && (a<c)) {
			if (b<c) {
				System.out.println("a < b < c");
			} else {
				System.out.println("a < c < b");
			}
		} 
		else if ((b < a) && (b < c)) {
			if (a < c) {
				System.out.println("b < a < c");
			} else {
				System.out.println("b < c < a");
			}
		} 
			else if ((c < a) && (c < b)) {
				if (a < b) {
					System.out.println("c < a < b");
				} else {
					System.out.println("c < b < a");
				}
			}
		}
		
		
	}


