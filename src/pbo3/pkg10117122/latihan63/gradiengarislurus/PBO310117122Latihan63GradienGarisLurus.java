/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan63.gradiengarislurus;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program ini berisi program untuk menghitung gradien 
 *                     dengan 2 titik dan menampilkan, menggunakan pendekatan 
 *                     berbasis objek.
 */
public class PBO310117122Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat = new Koordinat(2, 5, 10, 7);
        System.out.println("Garis yang melalui titk (" + koordinat.getX1() + ","
                + koordinat.getY1() +") dan " + "(" +koordinat.getX2() + ","
                + koordinat.getY2()+")" +" Memiliki Gradien Sebesar " + 
                  koordinat.hitungGradien());
        Koordinat koordinat2 = new Koordinat(5, 3, 1, 12);
        System.out.println("Garis yang melalui titk (" + koordinat2.getX1() + ","
                + koordinat2.getY1() +") dan " + "(" + koordinat2.getX2() + ","
                + koordinat2.getY2()+")" +" Memiliki Gradien Sebesar " + 
                  koordinat2.hitungGradien());
    }
    
}
