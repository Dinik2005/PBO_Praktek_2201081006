/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dini160623.model;

/**
 *
 * @author Ideapad 3 14ITL6
 */
public class Tes {
    public static void main(String[] args){
        //Cara menampilkan error ke layar.
        try{
            System.out.println(args[0]);
            System.out.println(1/0);
        }catch(java.lang.Exception ex){
            System.out.println("Error :"+ex.getMessage());
 }
}
}
