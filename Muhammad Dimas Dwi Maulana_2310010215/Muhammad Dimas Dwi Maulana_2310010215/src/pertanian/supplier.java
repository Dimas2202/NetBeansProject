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
public class supplier {
    private String kode;
    private String tgl_daftar;
    private String nama;
    private String alamat;
    private String no_hp;

    public supplier() {
    }

    public supplier(String kode) {
        this.kode = kode;
    }

    public supplier(String kode, String tgl_daftar) {
        this.kode = kode;
        this.tgl_daftar = tgl_daftar;
    }

    public supplier(String kode, String tgl_daftar, String nama) {
        this.kode = kode;
        this.tgl_daftar = tgl_daftar;
        this.nama = nama;
    }

    public supplier(String kode, String tgl_daftar, String nama, String alamat) {
        this.kode = kode;
        this.tgl_daftar = tgl_daftar;
        this.nama = nama;
        this.alamat = alamat;
    }

    public supplier(String kode, String tgl_daftar, String nama, String alamat, String no_hp) {
        this.kode = kode;
        this.tgl_daftar = tgl_daftar;
        this.nama = nama;
        this.alamat = alamat;
        this.no_hp = no_hp;
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

    public String getTgl_daftar() {
        return tgl_daftar;
    }

    public void setTgl_daftar(String tgl_daftar) {
        this.tgl_daftar = tgl_daftar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public void infoSupplier(){
        String pesan = "Kode :"+getKode()+
                       "\nTanggal Daftar :"+getTgl_daftar()+
                       "\nNama :"+getNama()+
                       "\nAlamat :"+getAlamat()+
                       "\nNo HP :"+getNo_hp();
        JOptionPane.showMessageDialog(null, pesan);
    }
}
