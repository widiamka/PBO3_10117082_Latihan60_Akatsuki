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
public class PBO3_10117082_Latihan60_Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==DAFTAR ANGGOTA AKATSUKI==");
        System.out.println("");
        Akatsuki ak = new Akatsuki();
        ak.setAnggota("Pain");
        ak.tampilAkatsuki();
        Asall as = new Asall();
        as.setAsal("Amegakure");
        as.tampilAkatsuki();
        CiriKhas ck = new CiriKhas();
        ck.setCiriKhas("Memiliki besi hitam berupa tindikan di hampir seluruh "
                + "tubuh, rambut berwarna jingga.");
        ck.tampilAkatsuki();
        Jurus j = new Jurus();
        j.setJurus("Rine Tensei, Shinra Tensei, BanshoTein, Chibaku Tensei, "
                + "Kuchiyose, Dan jurus Rine lainnya");
        j.tampilAkatsuki();
        
        System.out.println("");
        Akatsuki ak1 = new Akatsuki();
        ak1.setAnggota("Konan");
        ak1.tampilAkatsuki();
        Asall as1 = new Asall();
        as1.setAsal("Amegakure");
        as1.tampilAkatsuki();
        CiriKhas ck1 = new CiriKhas();
        ck1.setCiriKhas("Memiliki aksesoris origami bunga di kepala, berambut biru.");
        ck1.tampilAkatsuki();
        Jurus j1 = new Jurus();
        j1.setJurus(" Memisahkan dirinya menjadi berlembar-lembar kertas yang "
                + "dapat berubah bentuk menjadi origami kupu-kupu");
        j1.tampilAkatsuki();
        
         System.out.println("");
        Akatsuki ak2 = new Akatsuki();
        ak2.setAnggota("Zetsu");
        ak2.tampilAkatsuki();
        Asall as2 = new Asall();
        as2.setAsal("Chakra Kaguya Otsutsuki");
        as2.tampilAkatsuki();
        CiriKhas ck2 = new CiriKhas();
        ck2.setCiriKhas("Berwajah hitam dan putih, mempunyai dua kepribadian, "
                + "kanibal, memiliki kerudung kepala seperti tumbuhan venus.");
        ck2.tampilAkatsuki();
        Jurus j2 = new Jurus();
        j2.setJurus(" Hiru Banshō: Bōka no Jutsu), yang membuatnya bisa bersatu "
                + "dengan tanah, pohon, dan tumbuhan yang lain untuk perjalanan "
                + "jarak jauh dengan cepat.");
        j2.tampilAkatsuki();
        
         System.out.println("");
        Akatsuki ak3 = new Akatsuki();
        ak3.setAnggota("Kisame Hoshigaki");
        ak3.tampilAkatsuki();
        Asall as3 = new Asall();
        as3.setAsal("Kirigakure");
        as3.tampilAkatsuki();
        CiriKhas ck3 = new CiriKhas();
        ck3.setCiriKhas("Memiliki Kulit seperti ikan hiu, bergigi seperti ikan hiu.");
        ck3.tampilAkatsuki();
        Jurus j3 = new Jurus();
        j3.setJurus("Jutsu bertipe air yang sering dikombinasikan dengan"
                + " kekuatan fisiknya yang luar biasa");
        j3.tampilAkatsuki();
        
         System.out.println("");
        Akatsuki ak4 = new Akatsuki();
        ak4.setAnggota("Tobi (Obito Uchiha)");
        ak4.tampilAkatsuki();
        Asall as4 = new Asall();
        as4.setAsal("Konohagakure");
        as4.tampilAkatsuki();
        CiriKhas ck4 = new CiriKhas();
        ck4.setCiriKhas("Topeng jingga dengan satu lubang mata dengan pola "
                + "pusaran yang terpusat pada mata kanan. Mata kanannya "
                + "memiliki Sharingan dan topeng putih dengan tiga lubang "
                + "dengan titik di tengah mirip seperti \"Sharingan\". Saat "
                + "perang dunia shinobu keempat, mata kirinya berupa rinnegan.");
        ck4.tampilAkatsuki();
        Jurus j4 = new Jurus();
        j4.setJurus("Belum jelas");
        j4.tampilAkatsuki();
        
         System.out.println("");
        Akatsuki ak5 = new Akatsuki();
        ak5.setAnggota("Hidan");
        ak5.tampilAkatsuki();
        Asall as5 = new Asall();
        as5.setAsal("Yugakure");
        as5.tampilAkatsuki();
        CiriKhas ck5 = new CiriKhas();
        ck5.setCiriKhas("Tidak bisa mati, membawa sabit besar bermata tiga, "
                + "rambut cepak berwarna pucat");
        ck5.tampilAkatsuki();
        Jurus j5 = new Jurus();
        j5.setJurus("Tidak bisa mati");
        j5.tampilAkatsuki();
        
    }
    
}
