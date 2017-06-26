package com.javashop.pc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chenjie on 2017/6/26.
 */
@Controller
@RequestMapping("/shop")
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
