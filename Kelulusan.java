/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizal U
 */
import java.util.Scanner;
public class Kelulusan {
    public static void main(String[] args) {
        //Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        //Ambil Nama
        System.out.print("Masukkan nama Anda = ");
        String Nama = inp.nextLine();
        
        //Ambil NIM
        System.out.println("Masukkan NIM = ");
        String NIM = inp.nextLine();
        
        //Ambil Nilai
        System.out.println("Masukkan Nilai = ");
        int Nilai = inp.nextInt();
        
        //Print
        if(Nilai > 55) {
            System.out.println("Anda lulus ");
        } else {
            System.out.println("Anda tidak lulus ");
        }
    }
    
}
