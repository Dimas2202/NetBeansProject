/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertanian;
import javax.swing.JOptionPane;
/**
 *
 * @author DIMZY
 */

public class admin {
    private String id_admin;
    private String username;
    private String password;
    private String nama;
    private String alamat;
    private String no_hp;
    private String tgl_lahir;
    private String tgl_aktif;
    private String jabatan;
    private String avatar;

    public admin() {
    }

    public admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public admin(String id_admin, String username) {
        this.id_admin = id_admin;
        this.username = username;
    }

    public admin(String id_admin, String username, String password) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
    }

    public admin(String id_admin, String username, String password, String nama) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
        this.nama = nama;
    }
    
    public admin(String id_admin, String username, String password, String nama, String no_hp) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.no_hp = no_hp;
    }
    
    public admin(String id_admin, String username, String password, String nama, String no_hp, String tgl_aktif) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.no_hp = no_hp;
        this.tgl_aktif = tgl_aktif;
    }

    public admin(String id_admin, String username, String password, String nama, String no_hp, String tgl_lahir, String tgl_aktif) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.no_hp = no_hp;
        this.tgl_lahir = tgl_lahir;
        this.tgl_aktif = tgl_aktif;
    }
    
    public admin(String id_admin, String username, String password, String nama, String no_hp, String tgl_lahir, String tgl_aktif, String jabatan) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.no_hp = no_hp;
        this.tgl_lahir = tgl_lahir;
        this.tgl_aktif = tgl_aktif;
        this.jabatan = jabatan;
    }
    
    public admin(String id_admin, String username, String password, String nama, String no_hp, String tgl_lahir, String tgl_aktif, String jabatan, String avatar) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.no_hp = no_hp;
        this.tgl_lahir = tgl_lahir;
        this.tgl_aktif = tgl_aktif;
        this.jabatan = jabatan;
        this.avatar = avatar;
    }
    public admin(String id_admin, String username, String password, String nama, String alamat, String no_hp, String tgl_lahir, String tgl_aktif, String jabatan, String avatar) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.tgl_lahir = tgl_lahir;
        this.tgl_aktif = tgl_aktif;
        this.jabatan = jabatan;
        this.avatar = avatar;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        try {
            if (id_admin.equals(null) || id_admin.equals("")) {
                JOptionPane.showMessageDialog(null, "ID Admin belum diisi");
                this.id_admin="-";
            } else {
                this.id_admin=id_admin;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        try {
            if (username.equals(null) || username.equals("")) {
                JOptionPane.showMessageDialog(null, "Username Wajib Diisi");
                this.username="-";
            } else {
                this.username=username;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            if (password.equals(null) || password.equals("")) {
                JOptionPane.showMessageDialog(null, "ID Password Wajib DIisi");
                this.password="-";
            } else {
                this.password=password;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        try {
            if (nama.equals(null) || nama.equals("")) {
                JOptionPane.showMessageDialog(null, "Nama Wajib Diisi");
                this.nama="-";
            } else {
                this.nama=nama;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        try {
            if (alamat.equals(null) || alamat.equals("")) {
                JOptionPane.showMessageDialog(null, "Alamat wajib diisi");
                this.alamat="-";
            } else {
                this.alamat=alamat;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        try {
            if (no_hp.equals(null) || no_hp.equals("")) {
                JOptionPane.showMessageDialog(null, "NO HP Wajib DIisi");
                this.no_hp="-";
            } else {
                this.no_hp = no_hp;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
        
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        try {
            if (tgl_lahir.equals(null) || tgl_lahir.equals("")) {
                JOptionPane.showMessageDialog(null, "Tanggal Lahir Wajib Diisi");
                this.tgl_lahir="-";
            } else {
                this.tgl_lahir = tgl_lahir;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
        
    }

    public String getTgl_aktif() {
        return tgl_aktif;
    }

    public void setTgl_aktif(String tgl_aktif) {
        try {
            if (tgl_aktif.equals(null) || tgl_aktif.equals("")) {
                JOptionPane.showMessageDialog(null, "Tanggal Aktif Wajib Diisi");
                this.tgl_aktif="-";
            } else {
                this.tgl_aktif = tgl_aktif;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
        
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        try {
            if (jabatan.equals(null) || jabatan.equals("")) {
                JOptionPane.showMessageDialog(null, "Jabatan Wajib DIisi");
                this.jabatan="-";
            } else {
                this.jabatan = jabatan;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
        
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        try {
            if (avatar.equals(null) || avatar.equals("")) {
                JOptionPane.showMessageDialog(null, "Avatar Wajib DIisi");
                this.avatar="-";
            } else {
                this.avatar = avatar;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah);
        }
    }
    
    public void infoadmin(){
        String pesan = "ID Admin :"+getId_admin()+
                       "\nUsername :"+getUsername()+
                       "\nPassword :"+getPassword()+
                       "\nNama :"+getNama()+
                       "\nAlamat :"+getAlamat()+
                       "\nNo HP :"+getNo_hp()+
                       "\nTanggal Lahir :"+getTgl_lahir()+
                       "\nTanggal Aktif :"+getTgl_aktif()+
                       "\nJabatan :"+getJabatan()+
                       "\nAvatar :"+getAvatar();
        JOptionPane.showMessageDialog(null, pesan);
    }
}

