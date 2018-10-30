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
        Policelogin policelogin =new Policelogin();
        Policeinfo policeinfo = new Policeinfo();
        if(policeloginMapper.selectByPrimaryKey(policeId)!=null){
            policelogin = policeloginMapper.selectByPrimaryKey(policeId);
            if (policelogin.getPassword().equals(password)) {
                policeinfo = policeinfoMapper.selectByPrimaryKey(policeId);
            } else{
                policeinfo.setPoliceid(null);
            }
        }else{
            policeinfo.setPoliceid(null);
        }
//        System.out.println(policelogin.getPoliceid()+policelogin.getPassword());
        return policeinfo;
    }
}
