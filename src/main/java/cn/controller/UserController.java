package cn.controller;

import cn.domain.User;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * 登录控制器
 * */

@Controller
@RequestMapping("/user")

//这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
//这样保证了session中存在user这个对象
@SessionAttributes("user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(User user, Model model){
        //调用Service方法
        user = userService.checkLogin(user.getUsername(),user.getPassword());
        //若有user则跳转到model里并跳转到成功页面
        if (user != null){
            model.addAttribute("user",user);
            //return "redirect:/book/allBook";
            return "redirect:/book/allBookAjax";
        }
        return "regist";
    }

    //正常访问regist页面
    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }

    //执行注册
    @RequestMapping("/doRegist")
    public String doRegist(User user,Model model){
        System.out.println(user.getUsername());
        userService.Regist(user);
        return "login";
    }
}
