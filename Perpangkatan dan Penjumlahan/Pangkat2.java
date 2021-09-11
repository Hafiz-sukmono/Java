package cobacobalatihan;

import javax.swing.*;
public class Pangkat2 {
	
	private int data;
	private double hasil;
	
	public void inputData()
	{
		String teks = JOptionPane.showInputDialog("Masukkan angka : ");
		data = Integer.parseInt(teks);
	}
	
	public void hitungPangkat()
	{
		hasil = Math.pow(this.data,2);	
	}
	
	public void displayData()
	{
		System.out.println("Menghitung Pangkat");
		System.out.println("Bilangan : " + this.data);
		System.out.println("Hasil    : " + this.hasil);
	}
}
