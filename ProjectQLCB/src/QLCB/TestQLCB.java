/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCB;

/**
 *
 * @author DNA
 */
public class TestQLCB {
    public static void main(String[] args) {
        ICanbo cbManager = new QLCB();

        Canbo canbo = new Canbo();
        canbo.setSoTK(1);
        canbo.setHoten("DNA");
        canbo.setGT("Male");
        canbo.setDiachi("HN");
        canbo.setLuong(10000);

        cbManager.insertCB(canbo);

        System.out.println("Dữ liệu đã được chèn thành công vào cơ sở dữ liệu.");
    }
}
