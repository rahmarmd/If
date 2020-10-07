/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaihuruf;

import java.util.Scanner;

public class NilaiHuruf {
    public static void main(String[] args) {
        //Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        //Ambil Nama
        System.out.print("Masukkan Nama Anda = ");
        String Nama = inp.nextLine();
        
        //Ambil NIM
        System.out.println("Masukkan NIM = ");
        String NIM = inp.nextLine();
        
        //Ambil Nilai
        System.out.println("Masukkan Nilai = ");
        int Nilai = inp.nextInt();
        
        //Print
         if(Nilai >=0 && Nilai <=55){
             System.out.println("E");
         }
         else if(Nilai >=56 && Nilai <=65){
             System.out.println("D");
         }
         else if(Nilai >=66 && Nilai <=75){
             System.out.println("C");
         }
         else if(Nilai >=76 && Nilai <=85){
             System.out.println("B");
         }
         else if(Nilai >=86 && Nilai <=100){
             System.out.println("A");
         }
         else if(Nilai <0 || Nilai >100) {
             System.out.println("Error");
         }
    }
}

