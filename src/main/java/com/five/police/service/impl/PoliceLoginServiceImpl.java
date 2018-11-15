package com.five.police.service.impl;

import com.five.police.model.Policeinfo;
import com.five.police.model.Policelogin;
import com.five.police.repository.PoliceinfoMapper;
import com.five.police.repository.PoliceloginMapper;
import com.five.police.service.PoliceLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoliceLoginServiceImpl implements PoliceLoginService {

    @Autowired
    private PoliceloginMapper policeloginMapper;
    @Autowired
    private PoliceinfoMapper policeinfoMapper;

    @Override
    public Policeinfo login(String policeId, String password) {
        Policeinfo policeinfo = null;
        Policelogin policelogin = policeloginMapper.selectByPrimaryKey(policeId);
        if (policelogin != null) {
            if (policelogin.getPassword().equals(password)) {
                policeinfo = policeinfoMapper.selectByPrimaryKey(policeId);
            }
        }
        return policeinfo;
    }
}
