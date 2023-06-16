/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dini.dao;
import java.util.List;
import java.util.ArrayList;
import Dini.model.Anggota;

/**
 *
 * @author Ideapad 3 14ITL6
 */
public class AnggotaDaoImpl implements AnggotaDao {
    private List<Anggota> data = new ArrayList();
    
       public AnggotaDaoImpl(){
        data.add(new Anggota ("112","Dini","padang","L"));
        data.add(new Anggota ("113","essa","solok","p"));
        
    }
    
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List<Anggota>getAll(){
        return data;
    }
}
