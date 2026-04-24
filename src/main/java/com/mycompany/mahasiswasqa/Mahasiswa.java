/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswasqa;

/**
 *
 * @author YUDDZAYAS
 */
public class Mahasiswa {
  public String nama;
    public double nilai;
    
    public Mahasiswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
    
    public boolean isLulus() {
        return nilai >= 60;
    }
}
