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
public class barang {
    private String kode_barang;
    private String nama;
    private String harga_beli;
    private String harga_jual;
    private String keterangan;
    private String terjual;
    private String terbeli;
    private String sisa;
    private int satuan;
    private String kode_qr;

    public barang() {
    }

    public barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public barang(String kode_barang, String nama) {
        this.kode_barang = kode_barang;
        this.nama = nama;
    }

    public barang(String kode_barang, String nama, String harga_beli) {
        this.kode_barang = kode_barang;
        this.nama = nama;
        this.harga_beli = harga_beli;
    }

    public barang(String kode_barang, String nama, String harga_beli, String harga_jual) {
        this.kode_barang = kode_barang;
        this.nama = nama;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
    }
    
    public barang(String kode_barang, String nama, String harga_beli, String harga_jual, String keterangan) {
        this.kode_barang = kode_barang;
        this.nama = nama;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
        this.keterangan = keterangan;
    }
    
    public barang(String kode_barang, String nama, String harga_beli, String harga_jual, String keterangan, String terjual) {
        this.kode_barang = kode_barang;
        this.nama = nama;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
        this.keterangan = keterangan;
        this.terjual = terjual;
    }
    
    public barang(String kode_barang, String nama, String harga_beli, String harga_jual, String keterangan, String terjual, String terbeli) {
        this.kode_barang = kode_barang;
        this.nama = nama;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
        this.keterangan = keterangan;
        this.terjual = terjual;
        this.terbeli = terbeli;
    }
    
    public barang(String kode_barang, String nama, String harga_beli, String harga_jual, String keterangan, String terjual, String terbeli, String sisa) {
        this.kode_barang = kode_barang;
        this.nama = nama;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
        this.keterangan = keterangan;
        this.terjual = terjual;
        this.terbeli = terbeli;
        this.sisa = sisa;
    }
    
    public barang(String kode_barang, String nama, String harga_beli, String harga_jual, String keterangan, String terjual, String terbeli, String sisa, int satuan) {
        this.kode_barang = kode_barang;
        this.nama = nama;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
        this.keterangan = keterangan;
        this.terjual = terjual;
        this.terbeli = terbeli;
        this.sisa = sisa;
        this.satuan = satuan;
        this.kode_qr = kode_qr;
    }

    public barang(String kode_barang, String nama, String harga_beli, String harga_jual, String keterangan, String terjual, String terbeli, String sisa, int satuan, String kode_qr) {
        this.kode_barang = kode_barang;
        this.nama = nama;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
        this.keterangan = keterangan;
        this.terjual = terjual;
        this.terbeli = terbeli;
        this.sisa = sisa;
        this.satuan = satuan;
        this.kode_qr = kode_qr;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        if (kode_barang.equals("")) {
            JOptionPane.showMessageDialog(null, "Kode Barang Belum Diisi");
        }else{
         this.kode_barang = kode_barang;   
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getTerjual() {
        return terjual;
    }

    public void setTerjual(String terjual) {
        this.terjual = terjual;
    }

    public String getTerbeli() {
        return terbeli;
    }

    public void setTerbeli(String terbeli) {
        this.terbeli = terbeli;
    }

    public String getSisa() {
        return sisa;
    }

    public void setSisa(String sisa) {
        this.sisa = sisa;
    }

    public int getSatuan() {
        return satuan;
    }

    public void setSatuan(int satuan) {
        this.satuan = satuan;
    }

    public String getKode_qr() {
        return kode_qr;
    }

    public void setKode_qr(String kode_qr) {
        this.kode_qr = kode_qr;
    }

    public void infoBarang(){
        String pesan = "Kode Barang :"+getKode_barang()+
                       "\nNama :"+getNama()+
                       "\nHarga Beli :"+getHarga_beli()+
                       "\nHarga Jual :"+getHarga_jual()+
                       "\nKeterangan :"+getKeterangan()+
                       "\nTerjual :"+getTerjual()+
                       "\nTerbeli :"+getTerbeli()+
                       "\nSisa :"+getSisa()+
                       "\nSatuan :"+getSatuan()+
                       "\nKode QR :"+getKode_qr();
        JOptionPane.showMessageDialog(null, pesan);
    }
}
