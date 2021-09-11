package nomor2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KonversiWaktu {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("jam :");
		String data1 = input.readLine();
		System.out.print("menit :");
		String data2 = input.readLine();
		System.out.print("detik :");
		String data3 = input.readLine();
		
		int jam = Integer.parseInt(data1);
		int menit = Integer.parseInt(data2);
		int detik = Integer.parseInt(data3);
		
		int konversijam = jam*3600;
		int konversimenit= menit*60;
		int jumlahdetik = konversijam+konversimenit+detik;
		
		System.out.println("jumlah detik = " + jumlahdetik);
		

	}

}
