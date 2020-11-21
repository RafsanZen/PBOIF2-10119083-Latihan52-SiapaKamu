/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan52.siapakamu;

/**
 *
* NAMA        : Rafsam Zen Mustaofa
 * KELAS       : PBOIF2
 * NIM         : 10119083
 *
 */
public class Mahasiswa extends Manusia{
    private String nim,kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa() {
        System.out.println("Saya " + getNama() +" umur " + getUmur() + " tahun sedang belajar di kelas " + getKelas());
    }
    
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }

    private String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getUmur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setUmur(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNama(String nindi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
