/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelulusan2;

import java.util.Scanner;

public class Kelulusan2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    String Nama = "";
    String Jenis_Kelamin = "";
    int Tinggi_Badan = 0;
    
    System.out.println("Masukkan Nama : ");
    Nama = input.nextLine();
    
    System.out.println("Masukkan Jenis Kelamin (L / P)");
    Jenis_Kelamin = input.nextLine();
    switch(Jenis_Kelamin){
        case "L": 
        System.out.println("Laki Laki");
        System.out.println("Masukkan Tinggi Badan ");
        Tinggi_Badan = input.nextInt();
        
        if(Tinggi_Badan >=0 && Tinggi_Badan <=170){
        System.out.println("Anda Gagal");
        }
        else if(Tinggi_Badan >=171 && Tinggi_Badan <=230){
        System.out.println("Selamat Anda Lulus");
        }
        else{
        System.out.println("Data Tinggi Tidak Valid ");
        }
            break;
             case "l": 
        System.out.println("Laki Laki");
        System.out.println("Masukkan Tinggi Badan ");
        Tinggi_Badan = input.nextInt();
        
        if(Tinggi_Badan >=0 && Tinggi_Badan <=170){
        System.out.println("Anda Gagal");
        }
        else if(Tinggi_Badan >=171 && Tinggi_Badan <=230){
        System.out.println("Selamat Anda Lulus");
        }
        else{
        System.out.println("Data Tinggi Tidak Valid ");
        }
            break;
        case "P":
        System.out.println("Perempuan");
        System.out.println("Masukkan Tinggi Badan ");
        Tinggi_Badan = input.nextInt();
         if(Tinggi_Badan >=0 && Tinggi_Badan <=160){
        System.out.println("Anda Gagal");
        }
        else if(Tinggi_Badan >=161 && Tinggi_Badan <=210){
        System.out.println("Selamat Anda Lulus");
        }
          else{
        System.out.println("Data Tinggi Tidak Valid ");
        }
            break;
            case "p":
        System.out.println("Perempuan");
        System.out.println("Masukkan Tinggi Badan ");
        Tinggi_Badan = input.nextInt();
         if(Tinggi_Badan >=0 && Tinggi_Badan <=160){
        System.out.println("Anda Gagal");
        }
        else if(Tinggi_Badan >=161 && Tinggi_Badan <=210){
        System.out.println("Selamat Anda Lulus");
        }
          else{
        System.out.println("Data Tinggi Tidak Valid ");
        }
            break;
        default:
            System.out.println("Pilihan Tidak Ada");
            break;
    
    }
    }
}