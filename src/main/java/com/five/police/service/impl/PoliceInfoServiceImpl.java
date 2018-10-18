package com.five.police.service.impl;

import com.five.police.model.Policeinfo;
import com.five.police.repository.PoliceinfoMapper;
import com.five.police.service.PoliceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoliceInfoServiceImpl implements PoliceInfoService {

    private final PoliceinfoMapper policeinfoMapper;

    @Autowired
    public PoliceInfoServiceImpl(PoliceinfoMapper policeinfoMapper) {
        this.policeinfoMapper = policeinfoMapper;
    }

    @Override
    public Policeinfo get(String policeId) {
        return policeinfoMapper.selectByPrimaryKey(policeId);
    }
}