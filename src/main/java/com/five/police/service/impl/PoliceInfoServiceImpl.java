package com.five.police.service.impl;

import com.five.police.model.Policeinfo;
import com.five.police.repository.PoliceinfoMapper;
import com.five.police.service.PoliceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliceInfoServiceImpl implements PoliceInfoService {

    @Autowired
    private PoliceinfoMapper policeinfoMapper;

    @Override
    public List getPolice(String policeId) {
        return policeinfoMapper.selectByPolice(policeId);
    }

    @Override
    public List<Policeinfo> policequery(Policeinfo policeinfo) {
        return policeinfoMapper.selectallpolice(policeinfo);
    }
}
