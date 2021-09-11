package latihanpernyataanswitch;

import java.util.Scanner;

public class latihannomor1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Golongan : A/B/C/D");
		double GajiPokok,UangMakan,UangTransport,HariKerja,TotalGaji;
		String Golongan;
		Golongan = scan.nextLine();
		
		switch (Golongan) {
		case "A":
			System.out.print("Berapa Hari Kerja :");
			HariKerja = scan.nextInt();
			GajiPokok = 1000000;
			UangMakan = 80000;
			UangTransport = 100000;
			TotalGaji = GajiPokok + (UangMakan * HariKerja)+ (UangTransport * HariKerja);
			System.out.print("Total Gaji :" + TotalGaji);
		break;
		case "B" :
			System.out.print("Berapa Hari Kerja :");
			HariKerja=scan.nextInt();
			GajiPokok = 750000;
			UangMakan = 70000;
			UangTransport = 90000;
			TotalGaji = GajiPokok + (UangMakan * HariKerja)+ (UangTransport * HariKerja);
			System.out.print("Total Gaji :" + TotalGaji);
		break;
		case "C" :
			System.out.print("Berapa Hari Kerja :");
			HariKerja = scan.nextInt();
			GajiPokok = 500000;
			UangMakan = 60000;
			UangTransport = 80000;
			TotalGaji = GajiPokok + (UangMakan * HariKerja)+ (UangTransport * HariKerja);
			System.out.print("Total Gaji :" + TotalGaji);
		break;
		case "D" :
			System.out.print("Berapa Hari Kerja :");
			HariKerja = scan.nextInt();
			GajiPokok = 250000;
			UangMakan = 50000;
			UangTransport = 70000;
			TotalGaji = GajiPokok + (UangMakan * HariKerja)+ (UangTransport * HariKerja);
			System.out.print("Total Gaji :" + TotalGaji);
		break;	    
		}

	}

}
