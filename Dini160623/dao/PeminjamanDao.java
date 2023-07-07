/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dini160623.dao;
import Dini160623.model.Peminjaman;
import java.util.*;
/**
 *
 * @author Ideapad 3 14ITL6
 */
public interface PeminjamanDao {
    void insert(Peminjaman pinjam);
    void update(int index, Peminjaman pinjam);
    void delete(int index);
    Peminjaman getPeminjaman(int index);
    List<Peminjaman>getAll();
}
