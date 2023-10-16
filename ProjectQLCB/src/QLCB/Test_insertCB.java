/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCB;

/**
 *
 * @author DNA
 */
public class Test_insertCB {
    public static void doInsertCB(Canbo canbo){
        try{
        QLCB newcb = new QLCB();
        newcb.insertCB(canbo);
        System.out.println("Them thanh cong");
        }
        catch(Exception e){
            System.out.println("Them khong thanh cong");
        }
    }
    public static void main (String []args){
        Canbo canbo = new Canbo(1,"DNA","Male","Ha Noi",300000);
        doInsertCB(canbo);
    }
}
