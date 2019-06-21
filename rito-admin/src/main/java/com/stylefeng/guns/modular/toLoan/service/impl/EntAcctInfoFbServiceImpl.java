package com.stylefeng.guns.modular.toLoan.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.stylefeng.guns.modular.toLoan.dao.EntAcctInfoFbMapper;
import com.stylefeng.guns.modular.toLoan.model.EntAcctInfoFb;
import com.stylefeng.guns.modular.toLoan.service.IEntAcctInfoFbService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 企业借贷账户信息流水表 服务实现类
 * </p>
 *
 * @author wj
 * @since 2019-06-11
 */
@Service
public class EntAcctInfoFbServiceImpl extends ServiceImpl<EntAcctInfoFbMapper, EntAcctInfoFb> implements IEntAcctInfoFbService {


    @Override
    public List<Map<String, Object>> list(Page page, String condition) {
        List<Map<String, Object>> list = this.baseMapper.list(page, condition);
        return list;
    }
}
