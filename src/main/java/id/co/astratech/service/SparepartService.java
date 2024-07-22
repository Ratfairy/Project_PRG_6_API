package id.co.astratech.service;

import id.co.astratech.response.DtoResponse;
import id.co.astratech.vo.SparepartVo;

public interface SparepartService
{
    DtoResponse getAllSparepart();
    DtoResponse getSparepartById(Integer IdSparepart);
    DtoResponse saveSparepart(SparepartVo sparepart);
    DtoResponse updateSparepart(SparepartVo sparepart);
    DtoResponse deleteSparepart(Integer IdSparepart);
}
