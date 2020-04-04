package com.whj.relation.controller;

import com.whj.relation.mapper.StudentMapper;
import com.whj.relation.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author wanghj
 * @Description: com.whj.relation.controller
 * @Description TODO
 * @Date: 2019/9/28
 **/
@Controller

public class ShowController {
   @Autowired StudentMapper studentMapper;

    public String show(String sno){
        Student student = studentMapper.findBySno(sno);
        System.out.println(student.getSsex());
        return null;
    }


}
