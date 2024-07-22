package id.co.astratech.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "oto_mssukucadang")
@Data
public class SparepartModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sca_id")
    private int idSparepart;

    @Column(name = "sca_nama")
    private String namaSparepart;

    @Column(name = "sca_harga")
    private int hargaSparepart;

    @Column(name = "sca_satuan")
    private int satuanSparepart;

    @Column(name = "sca_merk")
    private String merkSparepart;

    @Column(name = "sca_deskripsi")
    private String deskripsiSparepart;

    @Column(name = "sca_status")
    private String statusSparepart;

    public SparepartModel(int idSparepart, String namaSparepart, int hargaSparepart, int satuanSparepart, String merkSparepart, String deskripsiSparepart, String statusSparepart) {
        this.idSparepart = idSparepart;
        this.namaSparepart = namaSparepart;
        this.hargaSparepart = hargaSparepart;
        this.satuanSparepart = satuanSparepart;
        this.merkSparepart = merkSparepart;
        this.deskripsiSparepart = deskripsiSparepart;
        this.statusSparepart = statusSparepart;
    }

    public SparepartModel()
    {
    }

    public int getIdSparepart() {
        return idSparepart;
    }

    public void setIdSparepart(int idSparepart) {
        this.idSparepart = idSparepart;
    }

    public String getNamaSparepart() {
        return namaSparepart;
    }

    public void setNamaSparepart(String namaSparepart) {
        this.namaSparepart = namaSparepart;
    }

    public int getHargaSparepart() {
        return hargaSparepart;
    }

    public void setHargaSparepart(int hargaSparepart) {
        this.hargaSparepart = hargaSparepart;
    }

    public int getSatuanSparepart() {
        return satuanSparepart;
    }

    public void setSatuanSparepart(int satuanSparepart) {
        this.satuanSparepart = satuanSparepart;
    }

    public String getMerkSparepart() {
        return merkSparepart;
    }

    public void setMerkSparepart(String merkSparepart) {
        this.merkSparepart = merkSparepart;
    }

    public String getDeskripsiSparepart() {
        return deskripsiSparepart;
    }

    public void setDeskripsiSparepart(String deskripsiSparepart) {
        this.deskripsiSparepart = deskripsiSparepart;
    }

    public String getStatusSparepart() {
        return statusSparepart;
    }

    public void setStatusSparepart(String statusSparepart) {
        this.statusSparepart = statusSparepart;
    }
}
