package penjumlahan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class penjumlahan {

	public static void main(String[] args) throws IOException 
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("Bilangan 1 : ");
		String data1 = input.readLine();
		System.out.print("Bilangan 2 : ");
		String data2 = input.readLine();
		
		int bilangan1 = Integer.parseInt(data1);
		int bilangan2 = Integer.parseInt(data2);
		
		int jumlah = bilangan1 + bilangan2;
				
		System.out.println("Jumlah = " + jumlah);		
		

	}

}
