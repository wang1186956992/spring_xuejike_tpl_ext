package com.example.demo.yewu;

/**
 * Created by yf004 on 2017/6/7.
 */
public enum Status {
    open,close;
    public String cn(){
        switch (this){
            case open:
                return "启用";
            case close:
                return "禁用";

            default:
                return "";
        }
    }
}
