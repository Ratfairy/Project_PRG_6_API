package id.co.astratech.vo;


import id.co.astratech.model.SparepartModel;

public class SparepartVo
{
    private Integer IdSparepart;
    private String namaSparepart;
    private Integer hargaSparepart;
    private Integer satuanSparepart;
    private String merkSparepart;
    private String deskripsiSparepart;
    private String statusSparepart;

    public SparepartVo()
    {

    }

    public SparepartVo(Integer idSparepart, String namaSparepart, Integer hargaSparepart, Integer satuanSparepart, String merkSparepart, String deskripsiSparepart, String statusSparepart) {
        IdSparepart = idSparepart;
        this.namaSparepart = namaSparepart;
        this.hargaSparepart = hargaSparepart;
        this.satuanSparepart = satuanSparepart;
        this.merkSparepart = merkSparepart;
        this.deskripsiSparepart = deskripsiSparepart;
        this.statusSparepart = statusSparepart;
    }

    public SparepartVo(SparepartModel sparepart) {
        this.namaSparepart = sparepart.getNamaSparepart();
        this.hargaSparepart = sparepart.getHargaSparepart();
        this.satuanSparepart = sparepart.getSatuanSparepart();
        this.merkSparepart = sparepart.getMerkSparepart();
        this.deskripsiSparepart = sparepart.getDeskripsiSparepart();
        this.statusSparepart = sparepart.getStatusSparepart();
    }

    public Integer getIdSparepart() {
        return IdSparepart;
    }

    public void setIdSparepart(Integer idSparepart) {
        IdSparepart = idSparepart;
    }

    public String getNamaSparepart() {
        return namaSparepart;
    }

    public void setNamaSparepart(String namaSparepart) {
        this.namaSparepart = namaSparepart;
    }

    public Integer getHargaSparepart() {
        return hargaSparepart;
    }

    public void setHargaSparepart(Integer hargaSparepart) {
        this.hargaSparepart = hargaSparepart;
    }

    public Integer getSatuanSparepart() {
        return satuanSparepart;
    }

    public void setSatuanSparepart(Integer satuanSparepart) {
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
