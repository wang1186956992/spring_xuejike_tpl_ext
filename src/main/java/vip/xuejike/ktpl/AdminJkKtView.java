package vip.xuejike.ktpl;

import com.bidanet.springmvc.demo.jkbuilder.data.JkMenu;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理主页
 * @author xuejike
 */
public class AdminJkKtView extends JkKtView {
    private AdminInfo info=new AdminInfo();

    public AdminJkKtView() {
        this.tpl="/kt_tpl/index.ftl";
        this.map.put("info",info);
    }

    public AdminInfo getInfo() {
        return info;
    }

    public void setInfo(AdminInfo info) {
        this.info = info;
        this.map.put("info",info);
    }

    @Override
    public String content() {
        return "";
    }
    @Data
    public static class AdminInfo{
        private String title;
        private String logoHtml;
        private String indexUrl;
        private String welcomeUrl;
        private String logoutUrl;
        private String top;
        private String left;
        private String username;
        private List<JkMenu> rightMenu =new ArrayList<>(5);
    }
}
