package Latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("Masukkan Nama:");
		String teks = input.readLine();
		System.out.println(teks);
		

	}

}
