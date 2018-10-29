/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan60.akatsuki;

/**
 *
 * @author Muhammad Fitrayana
 */
public class Akatsuki {
    
   protected String kostum;
   protected String tujuan;

    public Akatsuki(String kostum, String tujuan) {
        this.kostum = kostum;
        this.tujuan = tujuan;
    }

    public String getKostum() {
        return kostum;
    }

    public String getTujuan() {
        return tujuan;
    }
   
   public void tampilAkatsuki() {
       System.out.println("====Data Lengkap Anggota Akatsuki====");
       System.out.println("");
       System.out.println("Kostum : " + getKostum());
       System.out.println("Tujuan : " + getTujuan());
       System.out.println("");
   }
}
