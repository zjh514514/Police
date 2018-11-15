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
import java.util.List;
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
    public ResponseUtil login(@ApiParam(value = "用户名和密码") @RequestParam String policeid, @RequestParam String password, HttpSession session) {
        Policeinfo policeinfo = policeLoginService.login(policeid, password);
        if (policeinfo != null) {
            session.setAttribute("police", policeinfo);
            System.out.println(session.getAttribute("police"));
            return ResponseUtil.success().put("police", policeinfo).put("login", 1);
        } else {
            return ResponseUtil.error("用户名或密码错误");
        }
    }

    @ApiOperation(value = " 用户查询")
    @RequestMapping(value = "/userquery", method = RequestMethod.GET)
    @ResponseBody
    public ResponseUtil userquery(@RequestParam(value = "username", required = false, defaultValue = "") String policeid, HttpSession session) {
//        System.out.println(session.getAttribute("police"));
//        if (session.getAttribute("police") == null) {
//            return ResponseUtil.error("请登录");
//        }
        Policeinfo policeinfo = new Policeinfo();
        policeinfo.setPoliceid(policeid);
        Policeinfo policeinfo1 = new Policeinfo();
        policeinfo1.setPoliceid(policeid);
        List policeinfoList = policeInfoService.policequery(policeinfo1);
//        List policeinfoList = policeInfoService.getPolice(policeid);
        return ResponseUtil.success().put("police", policeinfoList);
    }
}
