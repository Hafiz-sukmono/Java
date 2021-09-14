package tugasAlgoCorona123;

import java.util.*;
import java.lang.Math;

public class AlgoCorona3 {

	public static void main(String[] args) {
		int gaji,upahperjam,JamLembur,upahlembur;
		Scanner scan = new Scanner(System.in);
		System.out.println("Pilih Golongan:");
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		
		String gol;
		System.out.print("Golongan:");
		gol = scan.nextLine();
		if (gol.equals("A")||gol.equals("a")) {
			System.out.print("Masukkan Jam Lembur:");
			JamLembur=scan.nextInt();
			upahlembur = JamLembur * 5000;
			gaji = 50000 + (4000 * 48) + upahlembur;
			System.out.print("gaji anda="+gaji);
		}else if (gol.equals("B")||gol.equals("b")) {
			System.out.print("Masukkan Jam Lembur:");
			JamLembur=scan.nextInt();
			upahlembur = JamLembur * 5000;
			gaji = 75000 + (5000 * 48) + upahlembur;
			System.out.print("gaji anda="+gaji);
		}else if (gol.equals("C")||gol.equals("c")) {
			System.out.print("Masukkan Jam Lembur:");
			JamLembur=scan.nextInt();
			upahlembur = JamLembur * 5000;
			gaji = 90000 + (6000 * 48) + upahlembur;
			System.out.print("gaji anda="+gaji);
		}else if (gol.equals("D")||gol.equals("d")) {
			System.out.print("Masukkan Jam Lembur:");
			JamLembur=scan.nextInt();
			upahlembur = JamLembur * 5000;
			gaji = 100000 + (7000 * 48) + upahlembur;
			System.out.print("gaji anda="+gaji);
		}			
	}

}
