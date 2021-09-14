package tugasAlgoCorona123;

import java.util.*;
import java.lang.Math;

public class AlgoCorona1 {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		float NilaiUAS; float NilaiUTS; float NilaiTugas; float NilaiAkhir;       
        System.out.println("Masukan Nilai UAS :");
        NilaiUAS = input.nextInt();
        System.out.println("Masukan Nilai UTS :");
        NilaiUTS = input.nextInt();
        System.out.println("Masukan Nilai Tugas :");
        NilaiTugas = input.nextInt();
        
        NilaiAkhir = NilaiTugas * 40/100;
        NilaiAkhir = NilaiUTS * 25/100;
        NilaiAkhir = NilaiUAS * 35/100;
        NilaiAkhir = (float) NilaiAkhir / 3;
        
        System.out.println(NilaiAkhir);
        if (NilaiAkhir >= 6) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
		
	}

}
