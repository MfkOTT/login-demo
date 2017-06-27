package com.zsj.controller;

import com.zsj.bean.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhoushijie on 2017/6/22.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }

    public static void main(String[] args) {
        String str = "23\\12\\3";
        System.out.println(str.replace("\\",""));
    }
}
