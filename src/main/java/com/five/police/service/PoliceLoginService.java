package com.five.police.service;

import com.five.police.model.Policeinfo;

public interface PoliceLoginService {

    Policeinfo login(String policeId, String password);

}
