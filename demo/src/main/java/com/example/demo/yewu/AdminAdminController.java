package com.example.demo.yewu;

import com.admin.AdminAdminEditView;
import com.admin.AdminAdminIndexView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yf004 on 2017/11/8.
 */
@Controller
@RequestMapping("/admin/admin")
public class AdminAdminController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(Admin admin, Page<Admin> page){

        admin.setDeleteTag(false);
        List<Admin> list = new ArrayList<>();
        list.add(new Admin());
        list.add(new Admin());
        list.add(new Admin());
        Long count = 3L;
        page.setList(list);
        page.setTotal(count);

        AdminAdminIndexView view = new AdminAdminIndexView(page, admin);
        return view.toHtml();
    }

    @RequestMapping("/edit")
    @ResponseBody
    public String edit(Long id){
        Admin vo =new Admin();
        vo.setId(1L);
        return new AdminAdminEditView(vo).toHtml();
    }
    @RequestMapping("/editSave")
    @ResponseBody
    public AjaxCallBack editSave(Admin admin){

        return AjaxCallBack.saveSuccess();
    }

    @RequestMapping("/addSave")
    @ResponseBody
    public AjaxCallBack addSave(Admin admin){
        return AjaxCallBack.saveSuccess();
    }

    @RequestMapping("/del")
    @ResponseBody
    public AjaxCallBack del(Long id){
        return AjaxCallBack.deleteSuccess();
    }


    @RequestMapping("/updateStatus")
    @ResponseBody
    public AjaxCallBack updateStatus(Long id){
        return AjaxCallBack.handleSuccess();
    }


}
