package cobacobalatihan;

import javax.swing.JOptionPane;

public class NilaiAkhir {

private int nilaiUTS, nilaiUAS, nilaiTugas;
private double hasil;	
	
	public void inputData()
	{
		String teks1 = JOptionPane.showInputDialog("Masukkan Nilai UTS : ");
		nilaiUTS = Integer.parseInt(teks1);
		String teks2 = JOptionPane.showInputDialog("Masukkan Nilai UAS : ");
		nilaiUAS = Integer.parseInt(teks2);
		String teks3 = JOptionPane.showInputDialog("Masukkan Nilai Tugas : ");
		nilaiTugas = Integer.parseInt(teks3);
	}

	public void hitungnilaiakhir()
	{
		hasil = (nilaiUTS*0.25) + (nilaiUAS*0.35) + (nilaiTugas*0.40);	
	}

	public void displayData()
	{
		System.out.println("Menghitung Nilai Akhir");
		System.out.println("Nilai UTS : " + this.nilaiUTS);
		System.out.println("nilai UAS : " + this.nilaiUAS);
		System.out.println("Nilai Tugas : " + this.nilaiTugas);
		System.out.println("Hasil    : " + this.hasil);
	}



}

