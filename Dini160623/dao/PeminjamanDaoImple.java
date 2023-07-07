/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dini160623.dao;
import java.util.*;
import Dini160623.model.Peminjaman;
/**
 *
 * @author Ideapad 3 14ITL6
 */
public class PeminjamanDaoImple implements PeminjamanDao {
    private final List<Peminjaman> data1 = new ArrayList<>();

    @Override
    public void insert(Peminjaman pinjam) {
        data1.add(pinjam);
    }
    
    public PeminjamanDaoImple() {
        data1.add(new Peminjaman("A001","B001","07-07-2023","10-07-2023"));
    }

    @Override
    public void update(int index, Peminjaman pinjam) {
        data1.set(index, pinjam);
    }

    @Override
    public void delete(int index) {
        data1.remove(index);
    }

    @Override
    public Peminjaman getPeminjaman(int index) {
       return data1.get(index);
    }

    @Override
    public List<Peminjaman> getAll() {
        return data1;
    }

      
}
