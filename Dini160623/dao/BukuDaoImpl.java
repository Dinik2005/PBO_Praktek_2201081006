/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dini160623.dao;
import java.util.List;
import java.util.ArrayList;
import Dini160623.model.Buku;

/**
 *
 * @author Ideapad 3 14ITL6
 */
public class BukuDaoImpl implements BukuDao {
    private List<Buku> data = new ArrayList();
    
       public BukuDaoImpl(){
        data.add(new Buku ("101a","Algoritma Pemrograman","Dini","Erlangga"));
        data.add(new Buku ("101b","Pemrograman WEB","Annisa","Bintang obor"));
        
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku>getAll(){
        return data;
    }
}
