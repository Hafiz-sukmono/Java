package Segitiga;

import java.util.Scanner;
public class Segitiga {

	public static void main(String[] args) {
		
	    Scanner scanSatu = new Scanner(System.in);
	    System.out.print("Masukkan alas segitiga: ");
	    double alas = scanSatu.nextInt();
	    System.out.print("Masukkan tinggi segitiga: ");
	    double tinggi = scanSatu.nextInt();
	    
	    scanSatu.close();

	    double sisimiring = Math.sqrt((alas*alas)+(tinggi*tinggi));
	    System.out.println("sisi miring :" + sisimiring);
	    double keliling = (alas + tinggi + sisimiring);
	    System.out.println("keliling :" + keliling);
	    double luas = (alas = tinggi /2);
	    System.out.println("luas : " + luas);
	    
		
		
	}

}
