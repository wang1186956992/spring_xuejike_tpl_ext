package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bidanet.springmvc.demo.jkbuilder.data.JkMenu;
import com.example.demo.view.TestFormView;
import com.example.demo.view.TestModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.xuejike.ktpl.AdminJkKtView;
import vip.xuejike.ktpl.AdminLoginKtView;
import vip.xuejike.ktpl.common.ApiResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@RequestMapping
@Controller
public class HomeController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        AdminJkKtView testView = new AdminJkKtView();
        testView.getInfo().setTitle("极速模板");
        //首页地址
        testView.getInfo().setIndexUrl("/index");
        //定义左菜单加载的URL
        testView.getInfo().setLeft("/left");
        //定义头部菜单加载的URL
        testView.getInfo().setTop("/top");
        //定义 右菜单内容
        testView.getInfo().getRightMenu()
                .add(new JkMenu("修改密码","","http://www.baidu.com"));
        //定义首页 初始化界面地址
        testView.getInfo().setWelcomeUrl("/welcome");
        //退出登录地址
        testView.getInfo().setLogoutUrl("/admin/public/logout");
        //定义 当前登录的用户昵称
        testView.getInfo().setUsername("超级管理员");
        return testView.toHtml();

    }
    @RequestMapping("/form")
    @ResponseBody
    public TestFormView form(){
        TestFormView view = new TestFormView();
        view.setVo(new TestModel());
        return view;
    }

    public String login(){
        AdminLoginKtView adminLoginKtView = new AdminLoginKtView();
        adminLoginKtView.getInfo().setActionUrl("/public/login");
        adminLoginKtView.getInfo().setTitle("登录页");
        adminLoginKtView.getInfo().setUserName("用户名");
        adminLoginKtView.getInfo().setPwd("密码");
        adminLoginKtView.getInfo().setMsg("登录失败的错误消息");
        return adminLoginKtView.toHtml();
    }


    @RequestMapping("/top")
    @ResponseBody
    public ApiResult top() {
        ArrayList<Menu> list = new ArrayList<>(1);
        Menu menu = new Menu();
        menu.setText("基础功能");
        menu.setId(1L);
        menu.setIcon("");
        list.add(menu);
        return new ApiResult(list);
    }

    @RequestMapping("/left")
    @ResponseBody
    public ApiResult left() {
        List<Menu> menus = null;

        String json = "[\n" +
                "    {\"name\":\"会员卡管理\",\"icon\":\"\",\"children\":[\n" +
                "        {\"name\":\"会员卡\", \"icon\":\"&#xe735;\", \"url\":\"/admin/membershipCard/index\"}\n" +
                "        {\"name\":\"測試\", \"icon\":\"&#xe62a;\", \"url\":\"/admin/admin/index\"}\n" +
                "\n" +
                "    ]},\n" +
                "    {\"name\":\"商品管理\",\"icon\":\"\",\"children\":[\n" +
                "        {\"name\":\"商品\", \"icon\":\"&#xe66e;\", \"url\":\"/admin/goods/index\"},\n" +
                "        {\"name\":\"无条码商品分类\", \"icon\":\"&#xe857;\", \"url\":\"/admin/otherGoodsType/index\"}\n" +
                "    ]},\n" +
                "    {\"name\":\"门店管理\",\"icon\":\"\",\"children\":[\n" +
                "        {\"name\":\"门店\", \"icon\":\"&#xe698;\", \"url\":\"/admin/store/index\"}\n" +
                "    ]},\n" +
                "    {\"name\":\"门店商品管理\",\"icon\":\"\",\"children\":[\n" +
                "        {\"name\":\"门店商品\", \"icon\":\"&#xe657;\", \"url\":\"/admin/storeGoods/index\"}\n" +
                "\n" +
                "    ]},\n" +
                "    {\"name\":\"订单管理\",\"icon\":\"\",\"children\":[\n" +
                "        {\"name\":\"订单\", \"icon\":\"&#xe63c;\", \"url\":\"/admin/order/index\"},\n" +
                "\n" +
                "        {\"name\":\"充值\", \"icon\":\"&#xe65e;\", \"url\":\"/admin/recharge/index\"}\n" +
                "\n" +
                "    ]},\n" +
                "    {\"name\":\"订单数据管理\",\"icon\":\"\",\"children\":[\n" +
                "        {\"name\":\"订单统计\", \"icon\":\"&#xe62c;\", \"url\":\"/admin/orderStatistics/index\"},\n" +
                "\n" +
                "        {\"name\":\"充值统计\", \"icon\":\"&#xe629;\", \"url\":\"/admin/rechargeStatistics/index\"}\n" +
                "\n" +
                "    ]},\n" +
                "\n" +
                "    {\"name\":\"退款申请记录管理\",\"icon\":\"\",\"children\":[\n" +
                "        {\"name\":\"退款申请待审核\", \"icon\":\"&#xe664;\", \"url\":\"/admin/orderRefundRecord/getPageBytoAudit\"},\n" +
                "\n" +
                "        {\"name\":\"退款申请已审核\", \"icon\":\"&#xe60c;\", \"url\":\"/admin/orderRefundRecord/getPageByAudit\"}\n" +
                "\n" +
                "    ]},\n" +
                "    {\"name\":\"管理员管理\",\"icon\":\"\",\"children\":[\n" +
                "        {\"name\":\"管理员\", \"icon\":\"&#xe770;\", \"url\":\"/admin/admin/index\"}\n" +
                "\n" +
                "    ]},\n" +
                "    {\"name\":\"Erp同步信息管理\",\"icon\":\"\",\"children\":[\n" +
                "        {\"name\":\"erp同步信息\", \"icon\":\"&#xe601;\", \"url\":\"/admin/syncErpInfoLog/index\"},\n" +
                "\n" +
                "        {\"name\":\"erp调用错误日志\", \"icon\":\"&#xe6b2;\", \"url\":\"/admin/erpErrorLog/index\"}\n" +
                "\n" +
                "    ]},\n" +
                "    {\"name\":\"管理员操作\",\"icon\":\"\",\"children\":[\n" +
                "      {\"name\":\"消息消费日志\", \"icon\":\"&#xe63c;\", \"url\":\"/admin/mqMessageLog/index\"},\n" +
                "      {\"name\":\"系统配置菜单\", \"icon\":\"&#xe716;\", \"url\":\"/admin/config/index\"}\n" +
                "    ]}\n" +
                "\n" +
                "]";

        JSONArray jsonArray = JSONArray.parseArray(json);
        if(Objects.nonNull(jsonArray)){
            menus = recursionMenu(jsonArray);
        }

        return new ApiResult(menus);
    }



    private List<Menu> recursionMenu(JSONArray jsonArray){
        List<Menu> list = new ArrayList<>();
        for (Object obj : jsonArray) {
            if (obj instanceof JSONObject) {
                Menu menu = new Menu();
                JSONObject jsonObject = (JSONObject) obj;
                String name = CastUtil.castString(jsonObject.get("name"));
                String icon = CastUtil.castString(jsonObject.get("icon"));
                String url = CastUtil.castString(jsonObject.get("url"));
                menu.setText(name);
                menu.setIcon(icon);
                menu.setHref(url);

                Object children = jsonObject.get("children");
                if (Objects.nonNull(children)) {
                    if (children instanceof JSONArray) {
                        JSONArray childJSONArray = (JSONArray) children;
                        //递归调用
                        List<Menu> childMenu = recursionMenu(childJSONArray);
                        menu.setSubset(childMenu);
                    }
                }
                list.add(menu);
            }
        }

        return list;
    }
}
