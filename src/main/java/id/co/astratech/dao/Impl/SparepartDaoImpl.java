package id.co.astratech.dao.Impl;

import id.co.astratech.dao.SparepartDao;

import id.co.astratech.model.SparepartModel;
import id.co.astratech.repository.SparepartRepository;
import id.co.astratech.vo.SparepartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SparepartDaoImpl implements SparepartDao
{
    @Autowired
    private SparepartRepository sparepartRepository;

    @Override
    public List<SparepartVo> getAllSparepart() {
        Iterable<SparepartModel> spareparts = sparepartRepository.findAll();
        List<SparepartVo> sparepartVos = new ArrayList<>();
        for(SparepartModel item : spareparts){
            SparepartVo trainingVo = new SparepartVo(item);
            sparepartVos.add(trainingVo);
        }
        return sparepartVos;
    }

    @Override
    public SparepartVo getSparepartById(Integer idSparepart) {
        try {
            SparepartModel sparepart = sparepartRepository.findById(idSparepart).orElseThrow();
            if (sparepart != null) {
                SparepartVo sparepartVo = new SparepartVo(sparepart);
                return sparepartVo;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
