/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg303;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Yura
 * TGL : 22-03-2025
 * 
 */
public class Pertemuan303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pilih = "A";
        
        System.out.println("Menu Pilihan");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("A. Menu A");
        System.out.println("B. Menu B");
        System.out.println("C. Menu C");
        System.out.println("Silahkan pilih Menu (A/B/C) ");
//        pilih = JOptionPane.showInputDialog("Pilih Menu");
        Scanner inp = new Scanner(System.in);
        pilih = inp.nextLine();
        
        switch (pilih) {
            case "A":
                System.out.println("Memilih Menu A");
                break;
            
            case "B":
                System.out.println("Memilih Menu B");
                break;
            
            case "C":
                System.out.println("Memilih Menu C");
                break;
                
            default:
                System.out.println("Pilihan Menu Tidak Ada");
        }
        
    }
    
}
