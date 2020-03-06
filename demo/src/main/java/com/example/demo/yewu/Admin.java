package com.example.demo.yewu;

import lombok.Data;

/**
 * Created by yf004 on 2017/11/8.
 */
@Data
public class Admin {
    public Long id;
    public String userName;
    public String salt;
    public String pwd;
    public String name;
    public String mobile;
    public Long createTime;
    public Status status;
    public Boolean deleteTag;
}
