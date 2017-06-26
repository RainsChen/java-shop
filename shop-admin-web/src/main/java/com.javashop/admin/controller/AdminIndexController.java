package com.javashop.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chenjie on 2017/6/26.
 */
@Controller
@RequestMapping("/admin")
public class AdminIndexController {

    @RequestMapping("index")
    public String index() {
        return "admin/index";
    }
}
