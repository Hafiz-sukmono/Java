package latihanarray;

import java.util.Scanner;

public class latihanarrayno1 {

	public static void main(String[] args) {
		int A[] = new int [10];
        A[0] = 9;
        A[1] = 13;
        A[2] = 17;
        A[3] = 3;
        A[4] = 19;
        A[5] = 1;
        A[6] = 11;
        A[7] = 15;
        A[8] = 7;
        A[9] = 5;
        int i,j,N = 10, temp;
        System.out.println("Tampilan angka dari yang terkecil array");
        for (i = 0; i < N; i++) {
            for (j = N - 1; j > i; j--){
                if (A[j] < A[j-1]){
                temp = A[j];
                A[j] = A[j-1];
                A[j-1] = temp;
                }
            }
        }
        for (j = 0; j < N; j++) {
            System.out.println(A[j]);
        }
	}

}
