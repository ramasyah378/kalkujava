/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs15;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class GradeBook {
    
    private String courseName;
    
    public GradeBook(String name) {
        courseName = name;
    }
    
    public void setCourseName(String name) {
        courseName = name;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void displayMessage(){
        System.out.printf("Selamat datang di Program Kasir Sederhana\n%s\n\n", getCourseName());
    }
    
    public void KasirApp(){
        
        Scanner scan = new Scanner (System.in);
        
        int harga = 0;
        
        int hPensil = 2000, hPena = 4000, hBuku = 5000, hHapus = 1500, hPita = 2500;
        String barang, barang1 = "Pensil", barang2 = "Pena", barang3 = "Buku", barang4 = "Penghapus", barang5 = "Pita";
        
        
        System.out.println(" ___________________________________________________ ");
        System.out.println("|                   PRICELIST BARANG                |");
        System.out.println("|___________________________________________________|");
        System.out.println("|   Kode  |          Nama        |       Harga      |");
        System.out.println("|    1.   |         " + barang1 + "       |     Rp"+ hPensil + ", 00   |");
        System.out.println("|    2.   |         " + barang2 + "         |     Rp"+ hPena + ", 00   |");
        System.out.println("|    3.   |         " + barang3 + "         |     Rp"+ hBuku + ", 00   |");
        System.out.println("|    4.   |         " + barang4 + "    |     Rp"+ hHapus + ", 00   |");
        System.out.println("|    5.   |         " + barang5 + "         |     Rp"+ hPita + ", 00   |");
        System.out.println("|_________|______________________|__________________|");
        System.out.println("");
        
        for (String i = "Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("______________________________________");
            System.out.print("Masukkan kode barang : ");
            int inNomor = scan.nextInt();
            
            System.out.print("Masukkan banyak barang : ");
            int jumlah = scan.nextInt();
            System.out.println("______________________________________");
            
            if (inNomor == 1){
                barang = barang1;
                System.out.println("Pilihan anda " + inNomor + " adalah " + barang);
                harga = harga + hPensil * jumlah;
                
            } else if(inNomor == 2){
                barang = barang2;
                System.out.println("Pilihan anda " + inNomor + " adalah " + barang);
                harga = harga + hPena * jumlah;
            } else if(inNomor == 3){
                barang = barang2;
                System.out.println("Pilihan anda " + inNomor + " adalah " + barang);
                harga = harga + hBuku * jumlah;
            } else if(inNomor == 4){
                barang = barang2;
                System.out.println("Pilihan anda " + inNomor + " adalah " + barang);
                harga = harga + hHapus * jumlah;
            } else if(inNomor == 5){
                barang = barang2;
                System.out.println("Pilihan anda " + inNomor + " adalah " + barang);
                harga = harga + hPita * jumlah;
                
            } else {
                System.out.println("Nomor yang dipilih tidak ada di pricelist");
            }
                
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();
        }
        
        System.out.println("______________________________________");
        System.out.println("Total belanja " + harga + ".");
        System.out.print("dibayar : ");
        
        int dibayar = scan.nextInt();
        int selisih = dibayar - harga;
        
        if (selisih != 0) {
            System.out.println("Kembali " + selisih + "\n");
        }
        
        System.out.println("Terimakasih atas kunjungan anda");
    }
}

    
