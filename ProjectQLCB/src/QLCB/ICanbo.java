/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package QLCB;

/**
 *
 * @author DNA
 */
import java.sql.Connection;

public interface ICanbo {
    Connection getCon();

    void insertCB(Canbo canbo);
}
