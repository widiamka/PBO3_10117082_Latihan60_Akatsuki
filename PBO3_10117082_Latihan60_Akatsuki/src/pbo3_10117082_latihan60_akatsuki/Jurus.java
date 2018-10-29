/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan60_akatsuki;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan tokoh tokoh
* dan peran dalam film Akatsuki
 */
public class Jurus extends Akatsuki {
    protected String Jurus;

    public String getJurus() {
        return Jurus;
    }

    public void setJurus(String Jurus) {
        this.Jurus = Jurus;
    }
    @Override
    public void tampilAkatsuki(){
        System.out.println("Jurus : "+getJurus());
          
    } 
    
}
