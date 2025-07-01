/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Yura
 * TGL : 22-03-2025
 * 
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int naw = 0;
        naw = Integer.parseInt(JOptionPane.showInputDialog("Input nilai awal"));
        
        int awal = naw;
        int akhir = 0;
        akhir = Integer.parseInt(JOptionPane.showInputDialog("Input nilai akhir"));
        
        
        System.out.println("Perulangan While");
        while(awal<akhir){
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }
        
        System.out.println("Perulangan Do... While");
        awal = naw;
        do{
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }while(awal<akhir);
        
        System.out.println("Perulangan For");
        for(awal=naw; awal<akhir; awal++){
            System.out.println("Perulangan ke-"+awal);
        }
        
        
    }
    
}
