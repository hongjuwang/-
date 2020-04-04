package com.whj.relation.controller;

/**
 * @Author wanghj
 * @Description: com.relation.relation.controller
 * @Description TODO
 * @Date: 2019/9/17
 **/

import com.whj.relation.mapper.UserMapper;
import com.whj.relation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired UserMapper userMapper;

    @GetMapping("/index")
    public String index(HttpServletRequest request)
    {
           Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("token")) {
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                break;
            }
        }
                return "index";
    }

    @GetMapping("/hello")
    public String hello(Map<String,Object> map)
    {
        map.put("hello","你好!");
        return"list";
    }


}








