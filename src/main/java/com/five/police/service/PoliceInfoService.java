package com.five.police.service;

import com.five.police.model.Policeinfo;

import java.util.List;

public interface PoliceInfoService {

    List getPolice(String policeId);

    List<Policeinfo> policequery(Policeinfo policeinfo);
}
