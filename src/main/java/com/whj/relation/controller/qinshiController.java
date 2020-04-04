package com.whj.relation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author wanghj
 * @Description: com.whj.relation.controller
 * @Description TODO
 * @Date: 2019/11/21
 **/
@Controller
public class qinshiController {
    //查询员工列表
    @GetMapping("/shiyous")
    public String list(){
        return "list";
    }
  }
