package CRUD;

import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		boolean next = true;
		while (next)
		{
			clearScreen();
			System.out.println("\nDatabase Perpustakaan\n");
			System.out.println("1. Lihat Seluruh Buku");
			System.out.println("2. Cari Data Buku");
			System.out.println("3. Tambah Data Buku");
			System.out.println("4. Ubah Data Buku");
			System.out.println("5. Hapus Data Buku");
			
			System.out.print("\n\nPilihan Anda : ");
			String pilih = input.next();
			
			System.out.println("");
			
			switch (pilih) {
			case "1":
				System.out.println("\n=================");
				System.out.println("LIST SELURUH BUKU");
				System.out.println("=================");
				tampilkanData();
				break;
			case "2":
				System.out.println("\n==============");
				System.out.println("CARI DATA BUKU");
				System.out.println("==============");
				break;
			case "3":
				System.out.println("\n================");
				System.out.println("TAMBAH DATA BUKU");
				System.out.println("================");
				break;
			case "4":
				System.out.println("\n==============");
				System.out.println("UBAH DATA BUKU");
				System.out.println("==============");
				break;
			case "5":
				System.out.println("\n===============");
				System.out.println("HAPUS DATA BUKU");
				System.out.println("===============");
				break;

			default:
				System.err.println("\nInput Anda Tidak Ditemukan\nSilahkan Pilih 1-5");
			}
		
			next = getYesorNo("Apakah Anda Ingin Melanjutkan");
		}
		
	}
	private static void clearScreen()
	{
		try {
			if (System.getProperty("os.name").contains("Windows")) 
			{
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
			else
			{
				System.out.print("\033\143");
			}
		} catch (Exception e) 
		{
			System.err.println("tidak bisa clear screen");
		}
	}


	private static void tampilkanData() throws IOException
	{
		System.out.println("Kita akan menampilkan data nya disini brader");
		boolean Tambah = getYesorNo("Apakah Anda Ingin Menambah Data ");
	}
	
	private static boolean getYesorNo(String message)
	{
		Scanner klik = new Scanner(System.in);
		System.out.print("\n" + message + "(y/n)? ");
		String user = klik.next();
		
		while(!user.equalsIgnoreCase("y") && !user.equalsIgnoreCase("n"))
		{
			System.err.println("Pilihan anda bukan y atau n");
			System.out.print("\n" + message + "(y/n)? ");
			user = klik.next();
		}
			return user.equalsIgnoreCase("y");
	}
	
	
}

