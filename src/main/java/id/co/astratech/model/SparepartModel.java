package id.co.astratech.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Table(name = "oto_mssukucadang")
@Data
public class SparepartModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sca_id")
    private Integer idSparepart;

    @Column(name = "sca_nama")
    private String namaSparepart;

    @Column(name = "sca_harga")
    private BigInteger hargaSparepart;

    @Column(name = "sca_satuan")
    private String satuanSparepart;

    @Column(name = "sca_merk")
    private String merkSparepart;

    @Column(name = "sca_deskripsi")
    private String deskripsiSparepart;

    @Column(name = "sca_status")
    private Integer statusSparepart;

    public SparepartModel(Integer idSparepart, String namaSparepart, BigInteger hargaSparepart, String satuanSparepart, String merkSparepart, String deskripsiSparepart, Integer statusSparepart) {
        this.idSparepart = idSparepart;
        this.namaSparepart = namaSparepart;
        this.hargaSparepart = hargaSparepart;
        this.satuanSparepart = satuanSparepart;
        this.merkSparepart = merkSparepart;
        this.deskripsiSparepart = deskripsiSparepart;
        this.statusSparepart = statusSparepart;
    }

    public SparepartModel() {}

    public Integer getIdSparepart() {
        return idSparepart;
    }

    public void setIdSparepart(Integer idSparepart) {
        this.idSparepart = idSparepart;
    }

    public String getNamaSparepart() {
        return namaSparepart;
    }

    public void setNamaSparepart(String namaSparepart) {
        this.namaSparepart = namaSparepart;
    }

    public BigInteger getHargaSparepart() {
        return hargaSparepart;
    }

    public void setHargaSparepart(BigInteger hargaSparepart) {
        this.hargaSparepart = hargaSparepart;
    }

    public String getSatuanSparepart() {
        return satuanSparepart;
    }

    public void setSatuanSparepart(String satuanSparepart) {
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

    public Integer getStatusSparepart() {
        return statusSparepart;
    }

    public void setStatusSparepart(Integer statusSparepart) {
        this.statusSparepart = statusSparepart;
    }
}
