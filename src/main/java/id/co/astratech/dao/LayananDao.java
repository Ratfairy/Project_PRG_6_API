package id.co.astratech.dao;

import id.co.astratech.vo.LayananVo;
import id.co.astratech.vo.UserVo;

import java.util.List;

public interface LayananDao {
    List<LayananVo> getAllLayanan();
    LayananVo getLayananById(Integer idLayanan);
}
