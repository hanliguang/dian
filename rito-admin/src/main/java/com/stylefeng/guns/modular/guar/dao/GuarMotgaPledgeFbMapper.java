package com.stylefeng.guns.modular.guar.dao;

import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.modular.guar.model.GuarMotgaPledgeFb;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 企业担保-抵质押合同流水表 Mapper 接口
 * </p>
 *
 * @author wj123
 * @since 2019-06-19
 */
public interface GuarMotgaPledgeFbMapper extends BaseMapper<GuarMotgaPledgeFb> {

    /**
     * 获取列表
     */
    List<Map<String, Object>> list(@Param("page") Page page, @Param("condition") String condition);
}
