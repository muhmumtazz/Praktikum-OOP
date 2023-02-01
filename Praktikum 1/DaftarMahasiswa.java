import java.lang.System;
import java.util.Scanner;

public class DaftarMahasiswa{
	
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nama = scan.nextLine();
		String nim = scan.nextLine();
		int sks = scan.nextInt();
		int tambahSkS = scan.nextInt();
		
		Mahasiswa mahasiswa = new Mahasiswa( nama, nim, sks);

		System.out.println("Nama mahasiswa: " + mahasiswa.getNama());
		System.out.println("NIM mahasiswa: " + mahasiswa.getNim());
		System.out.println("SKS mahasiswa: " + mahasiswa.getSks());
		System.out.println("Jumlah mahasiswa: " + mahasiswa.getJumlahMahasiswa());
		System.out.println("Total Revisi SKS mahasiswa: " + (sks + tambahSkS));	
	}
}