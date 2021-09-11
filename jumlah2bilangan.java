package jumlah2bilangan;

import javax.swing.*;
public class jumlah2bilangan 
{

	public static void main(String[] args)
	{
		String teks1 = JOptionPane.showInputDialog("Masukkan nilai 1 =");
		String teks2 = JOptionPane.showInputDialog("Masukkan nilai 2 =");
		int nilai1 = Integer.parseInt(teks1);
		int nilai2 = Integer.parseInt(teks2);
		
		int hasil = nilai1 + nilai2;
		
		JOptionPane.showMessageDialog(null,"Hasilnya : " + hasil);

	}

}
