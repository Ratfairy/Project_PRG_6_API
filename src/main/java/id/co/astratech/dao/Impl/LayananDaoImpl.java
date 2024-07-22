package id.co.astratech.dao.Impl;

import id.co.astratech.dao.LayananDao;
import id.co.astratech.model.LayananModel;
import id.co.astratech.repository.LayananRepository;
import id.co.astratech.vo.LayananVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LayananDaoImpl implements LayananDao {
    @Autowired
    private LayananRepository layananRepository;

    @Override
    public List<LayananVo> getAllLayanan() {
        Iterable<LayananModel> layanans = layananRepository.findAll();
        List<LayananVo> layananVos = new ArrayList<>();
        for(LayananModel item : layanans){
            LayananVo trainingVo = new LayananVo(item);
            layananVos.add(trainingVo);
        }
        return layananVos;
    }

    @Override
    public LayananVo getLayananById(Integer idLayanan) {
        try {
            LayananModel layanan = layananRepository.findById(idLayanan).orElseThrow();
            if (layanan != null) {
                LayananVo layananVo = new LayananVo(layanan);
                return layananVo;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
