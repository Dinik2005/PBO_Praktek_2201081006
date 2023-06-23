/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dini160623.dao;

import Dini160623.model.Buku;
import java.util.List;

/**
 *
 * @author Ideapad 3 14ITL6
 */
public interface BukuDao {
    void insert(Buku buku);
    void update(int index, Buku buku);
    void delete(int index);
    Buku getBuku(int index);
    List<Buku>getAll();
}

