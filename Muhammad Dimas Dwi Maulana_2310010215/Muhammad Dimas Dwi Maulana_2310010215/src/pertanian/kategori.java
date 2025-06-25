/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertanian;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class kategori {
    
    private String kode;
    private String nama;

    public kategori() {
    }

    public kategori(String kode) {
        this.kode = kode;
    }

    public kategori(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        if (kode.equals("")) {
            JOptionPane.showMessageDialog(null, "Kode Belum Diisi");
        }else{
        this.kode = kode;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void infoKategori(){
        String pesan = "Kode :"+getKode()+
                       "\nNama :"+getNama();
        JOptionPane.showMessageDialog(null, pesan);
    }
    
}
