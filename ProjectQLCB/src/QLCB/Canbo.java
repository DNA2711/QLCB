/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCB;

/**
 *
 * @author DNA
 */
public class Canbo {
    private int SoTK;
    private String Hoten;
    private String GT;
    private String Diachi;
    int Luong;

    public int getSoTK() {
        return SoTK;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getGT() {
        return GT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public int getLuong() {
        return Luong;
    }

    public void setSoTK(int SoTK) {
        this.SoTK = SoTK;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }
    
    public Canbo(){
    }
    
    public Canbo(int SoTK, String Hoten, String GT, String Diachi, int Luong) {
        this.SoTK = SoTK;
        this.Hoten = Hoten;
        this.GT = GT;
        this.Diachi = Diachi;
        this.Luong = Luong;
    }
}

