package com.five.police.service.impl;

import com.five.police.model.Policelogin;
import com.five.police.repository.PoliceloginMapper;
import com.five.police.service.PoliceLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoliceLoginServiceImpl implements PoliceLoginService {

    private final PoliceloginMapper policeloginMapper;

    @Autowired
    public PoliceLoginServiceImpl(PoliceloginMapper policeloginMapper) {
        this.policeloginMapper = policeloginMapper;
    }

    @Override
    public boolean login(String policeId, String password) {
        Policelogin policelogin = policeloginMapper.selectByPrimaryKey(policeId);
        return policelogin.getPassword().equals(password);
    }
}
