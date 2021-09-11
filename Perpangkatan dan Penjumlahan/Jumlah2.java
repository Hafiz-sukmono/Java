package cobacobalatihan;

import javax.swing.*;
public class Jumlah2 {
	
	private int bil1, bil2;
	
	public void inputData()
	{
		String teks1 = JOptionPane.showInputDialog("Masukkan Bilangan 1 : ");
		bil1 = Integer.parseInt(teks1);
		String teks2 = JOptionPane.showInputDialog("Masukkan Bilangan 2 : ");
		bil2 = Integer.parseInt(teks2);
	}
	
	double hitungJumlah()
	{
		return bil1 + bil2 ;	
	}
	
	public void displayData()
	{
		System.out.println("Menghitung Jumlah");
		System.out.println("Bilangan 1 : " + this.bil1);
		System.out.println("Bilangan 2 : " + this.bil2);
		System.out.println("Hasil      : " + this.hitungJumlah());
	}
}
