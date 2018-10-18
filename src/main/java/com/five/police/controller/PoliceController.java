package com.five.police.controller;

import com.five.police.model.Policeinfo;
import com.five.police.model.Policelogin;
import com.five.police.service.PoliceInfoService;
import com.five.police.service.PoliceLoginService;
import com.five.police.utils.ResponseUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/police")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PoliceController {

    @Autowired
    private PoliceLoginService policeLoginService;
    @Autowired
    private PoliceInfoService policeInfoService;

    @ApiOperation(value = "用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseUtil login(@ApiParam(value = "用户名和密码") @RequestBody Policelogin policelogin, HttpSession session) {
        if (policeLoginService.login(policelogin.getPoliceid(), policelogin.getPassword())) {
            Policeinfo policeinfo = policeInfoService.get(policelogin.getPoliceid());
            session.setAttribute("police", policeinfo);
            Map<String, Object> map = new HashMap<>();
            map.put("police", policeinfo);
            return ResponseUtil.success(map);
        } else {
            return ResponseUtil.error("用户名或密码错误");
        }
    }
}
