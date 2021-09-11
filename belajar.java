package belajar;

import java.util.Scanner;

public class belajar {

	public static void main(String[] args) {
		
		Scanner scanSatu = new Scanner(System.in);
		
		System.out.print("NIM : ");
		String nim = scanSatu.nextLine();
		
		System.out.print("Nama : ");
		String nama = scanSatu.nextLine();
		
		scanSatu.close();
		
		System.out.println("Selamat Datang");
		System.out.println("NIM ==> " + nim);
		System.out.println("Nama ==> " + nama);

	}

}
