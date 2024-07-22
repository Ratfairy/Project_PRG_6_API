package id.co.astratech.vo;


import id.co.astratech.model.SparepartModel;

import java.math.BigInteger;

public class SparepartVo
{
    private Integer idSparepart;
    private String namaSparepart;
    private BigInteger hargaSparepart;
    private String satuanSparepart;
    private String merkSparepart;
    private String deskripsiSparepart;
    private Integer statusSparepart;

    public SparepartVo() { }

    public SparepartVo(Integer idSparepart, String namaSparepart, BigInteger hargaSparepart, String satuanSparepart, String merkSparepart, String deskripsiSparepart, Integer statusSparepart) {
        this.idSparepart = idSparepart;
        this.namaSparepart = namaSparepart;
        this.hargaSparepart = hargaSparepart;
        this.satuanSparepart = satuanSparepart;
        this.merkSparepart = merkSparepart;
        this.deskripsiSparepart = deskripsiSparepart;
        this.statusSparepart = statusSparepart;
    }

    public SparepartVo(SparepartModel sparepart) {
        this.idSparepart = sparepart.getIdSparepart();
        this.namaSparepart = sparepart.getNamaSparepart();
        this.hargaSparepart = sparepart.getHargaSparepart();
        this.satuanSparepart = sparepart.getSatuanSparepart();
        this.merkSparepart = sparepart.getMerkSparepart();
        this.deskripsiSparepart = sparepart.getDeskripsiSparepart();
        this.statusSparepart = sparepart.getStatusSparepart();
    }

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
