
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahma Dyah
 */
public class SoalBaruMatriks {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Masukkan Jumlah Baris ");
        int baris = scan.nextInt();
        System.out.println("Masukkan Jumlah Kolom");
        int kolom = scan.nextInt();
        int matriks [][] = new int [baris][kolom];
        
         for (int index = 0; index < matriks.length; index++) {
            for (int i = 0; i < matriks[index].length; i++) {
                System.out.println("Masukkan Nilai Baris"+index+" kolom "+i+": "); 
                matriks[index][i] = scan.nextInt();
            }
             System.out.println();
            }
        
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) { 
                System.out.print(matriks[i][j] + ", ");
            }
            System.out.println();
        }    
    }
}
 