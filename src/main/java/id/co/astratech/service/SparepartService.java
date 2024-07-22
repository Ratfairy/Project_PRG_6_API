package id.co.astratech.service;

import id.co.astratech.model.SparepartModel;
import id.co.astratech.response.DtoResponse;
import id.co.astratech.vo.SparepartVo;

public interface SparepartService
{
    DtoResponse getAllSparepart();
    DtoResponse getSparepartById(Integer idSparepart);
    DtoResponse saveSparepart(SparepartModel sparepart);
    DtoResponse updateSparepart(SparepartModel updatesparepart);
    DtoResponse deleteSparepart(Integer idSparepart);
    DtoResponse softDeleteSparepart(Integer idSparepart);
}
