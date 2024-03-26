/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg1;

/**
 *
 * @author Tanji
 */
public class Modul1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        manusia manusia1 = new manusia();
        manusia manusia2 = new manusia();
        
        manusia1.nama="jitan";
        manusia1.umur=20;
        manusia1.alamat="nusa";
        manusia1.kelas=4;

        
        manusia2.nama="jujun";
        manusia2.umur=19;
        manusia2.alamat="pasir";
        manusia2.kelas=7;
        
        System.out.println("Nama : " + manusia1.nama);
        System.out.println("Umur : " + manusia1.umur);
        System.out.println("Alamat : " + manusia1.alamat);
        manusia1.berlari();
        
        System.out.println("Nama : " + manusia2.nama);
        System.out.println("Umur : " + manusia2.umur);
        System.out.println("Alamat : " + manusia2.alamat);
        manusia2.berjalan();
    }
}
