package nomor1;

import java.util.Scanner;
public class PersegiPanjang {

	public static void main(String[] args) {
		Scanner scanSatu = new Scanner(System.in);
		
		int pulpen, pensil, kertas, plastik, pilihan, a, b;
		double harga, total;
		
		System.out.println ("DAFTAR BARANG ATK");
		System.out.println ("1. Pulpen 		 : 20.000");
		System.out.println ("2. Pensil 		 :  5.000");
		System.out.println ("3. Kertas 1 rim 	 : 40.000");
		System.out.print ("Pilih (1/2/3): ");
		pilihan = scanSatu.nextInt();
		
	pulpen = 20000;
	pensil = 5000;
	kertas = 40000;
	plastik = 200;
	a = 0;
	b = 0;
	
			
		switch (pilihan) {
		case 1:
			System.out.println ("masukan jumlah pulpen");
			a = scanSatu.nextInt();
			System.out.println ("masukan jumlah plastik");
			b = scanSatu.nextInt();
			harga = (a*pulpen) + (b*plastik);
			System.out.println ("harga seluruhnya ;" + harga);
			break;
		case 2:
			System.out.println ("masukan jumlah pensil");
			a = scanSatu.nextInt();
			System.out.println ("masukan jumlah plastik");
			b = scanSatu.nextInt();
			harga = (a*pensil) + (b*plastik);
			System.out.println ("harga seluruhnya ;" + harga);
			break;
		case 3:
			System.out.println ("masukan jumlah kertas (dalam rim)");
			a = scanSatu.nextInt();
			System.out.println ("masukan jumlah plastik");
			b = scanSatu.nextInt();
			harga = (a*kertas) + (b*plastik);
			System.out.println ("harga seluruhnya ;" + harga);
			break;
		
			
		}
	}
}
