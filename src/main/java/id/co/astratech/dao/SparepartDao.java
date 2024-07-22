package id.co.astratech.dao;


import id.co.astratech.vo.SparepartVo;

import java.util.List;

public interface SparepartDao
{
    List<SparepartVo> getAllSparepart();
    SparepartVo getSparepartById(Integer idSparepart);
}
