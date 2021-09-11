package nomor1;

import java.util.Scanner;
public class dirumahaja {

	public static void main(String[] args) {
		double bil1, bil2, bil3, bil4, bil5, bil6, rata;
		
		Scanner scanSatu = new Scanner(System.in);
		System.out.print ("masukan bilangan 1: ");
		bil1 = scanSatu.nextDouble();
		System.out.print ("masukan bilangan 2: ");
		bil2 = scanSatu.nextDouble();
		System.out.print ("masukan bilangan 3: ");
		bil3 = scanSatu.nextDouble();
		System.out.print ("masukan bilangan 4: ");
		bil4 = scanSatu.nextDouble();
		System.out.print ("masukan bilangan 5: ");
		bil5 = scanSatu.nextDouble();
		System.out.print ("masukan bilangan 6: ");
		bil6 = scanSatu.nextDouble();
		scanSatu.close();
		System.out.println( Math.min (bil1, bil2)); 
		System.out.println( Math.min (bil3, bil4));
		System.out.println( Math.min (bil5, bil6));
		System.out.println();		
		System.out.println( Math.max (bil1, bil2)); 
		System.out.println( Math.max (bil3, bil4));
		System.out.println( Math.max (bil5, bil6));
		System.out.println(); 
		
		rata = (bil1 + bil2 + bil3 + bil4 + bil5 + bil6) / 6;
		System.out.print ("rata-rata: " + rata);

	}

}
