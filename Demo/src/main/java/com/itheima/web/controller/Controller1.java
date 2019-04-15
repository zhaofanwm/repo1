package com.itheima.web.controller;
import com.itheima.domin.item;
import com.itheima.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/aa")
public class Controller1 {
    @Autowired
    private itemService implService;
    @RequestMapping("/findid")
    public ModelAndView find(int id){
        ModelAndView mv =new ModelAndView();
        item item = implService.find(id);
        mv.addObject("item",item);
        mv.setViewName("success");
        return mv;
    }
}
