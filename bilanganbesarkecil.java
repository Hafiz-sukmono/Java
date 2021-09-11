package bilanganbesarkecil;

import java.util.Scanner;
public class bilanganbesarkecil {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan Nilai 1 : ");
		int nilai1 = scanSatu.nextInt();
		System.out.print("Masukkan Nilai 2 : ");
		int nilai2 = scanSatu.nextInt();
		System.out.print("Masukkan Nilai 3 : ");
		int nilai3 = scanSatu.nextInt();
		scanSatu.close();
		
		int besar = Math.max(nilai1, nilai2);
		besar = Math.max(besar, nilai3);
		int kecil = Math.min(nilai1, nilai2);
		kecil = Math.min(kecil, nilai3);
		
		System.out.println(besar);
		System.out.println(kecil);

	}

}
