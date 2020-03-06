package com.example.demo.yewu;

import com.bidanet.bdcms.core.common.SpringWebTool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.xuejike.ktpl.AdminLoginKtView;

/**
 * Created by yf004 on 2017/8/23.
 */
@Controller
@RequestMapping("/admin/public")
public class PublicAdminController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String login(String username, String pwd, String msg) {
        AdminLoginKtView loginKtView = new AdminLoginKtView();
        AdminLoginKtView.LoginInfo loginInfo = new AdminLoginKtView.LoginInfo();
        loginInfo.setTitle("线下超市后台管理系统");
        loginInfo.setActionUrl("/admin/public/login");
        loginInfo.setMsg(msg);
        loginInfo.setUserName(username);
        loginInfo.setPwd(pwd);
        loginKtView.setInfo(loginInfo);
        return loginKtView.toHtml();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String loginSave(String username, String pwd) {
        try {
//            adminUc.login(username, pwd);
            AjaxCallBack ajaxCallBack = new AjaxCallBack(AjaxCallBack.STATUS_OK, "登录成功");
            ajaxCallBack.setCloseCurrent(true);
            SpringWebTool.redirectUrl("/index");
        } catch (Exception e) {
            e.printStackTrace();
            return login(username, pwd, e.getMessage());
        }
        return "";
    }


    @RequestMapping("/logout")
    public String logout() {
        SpringWebTool.redirectUrl("/admin/public/login");
        return "";
    }





}
