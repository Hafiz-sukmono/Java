package tugasAlgoCorona123;

import java.util.*;
import java.lang.Math;

public class AlgoCorona2 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		
		int bilangan;
        int cetakBilangan;
        
        System.out.println("Masukan Bilangan 1-4");
        bilangan = input.nextInt();
        if (bilangan == 1) {
            System.out.println("Satu");
        } else {
            if (bilangan == 2) {
                System.out.println("Dua");
            } else {
                if (bilangan == 3) {
                    System.out.println("Tiga");
                } else {
                    if (bilangan == 4) {
                        System.out.println("Empat");
                    } else {
                        System.out.println("Anda Salah Memasukkan Kode");
                    }
                }
            }
        }
		
	}
}

