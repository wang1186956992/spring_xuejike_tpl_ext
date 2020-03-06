<#-- @ftlvariable name="info" type="vip.xuejike.ktpl.AdminLoginKtView.LoginInfo" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <title>登录</title>
      <#include "./head_css_tpl.ftl"/>

    <style>
        html, body, #app {
            height: 100%;
            margin: 0;
            padding: 0;
        }
        .login-left p{
            margin-bottom: 14px;
            margin-top: 14px;
        }

        .login-container {
            display: -webkit-box;
            display: -ms-flexbox;
            display: flex;
            -webkit-box-align: center;
            -ms-flex-align: center;
            align-items: center;
            position: relative;
            width: 100%;
            height: 100%;
            margin: auto;
            background: #f8f8f9;
            -webkit-animation: animate-cloud 20s linear infinite;
            animation: animate-cloud 20s linear infinite; }

        .login-weaper {
            margin: 0 auto;
            width: 1000px;
            -webkit-box-shadow: -4px 5px 10px rgba(0, 0, 0, 0.4);
            box-shadow: -4px 5px 10px rgba(0, 0, 0, 0.4); }

        .login-left,
        .login-border {
            position: relative;
            min-height: 500px;
            -webkit-box-align: center;
            -ms-flex-align: center;
            align-items: center;
            display: -webkit-box;
            display: -ms-flexbox;
            display: flex; }

        .login-left {
            border-top-left-radius: 5px;
            border-bottom-left-radius: 5px;
            -webkit-box-pack: center;
            -ms-flex-pack: center;
            justify-content: center;
            -webkit-box-orient: vertical;
            -webkit-box-direction: normal;
            -ms-flex-direction: column;
            flex-direction: column;
            background-color: #409EFF;
            color: #fff;
            float: left;
            width: 50%;
            position: relative; }

        .login-left .img {
            width: 140px; }

        .login-time {
            position: absolute;
            left: 25px;
            top: 25px;
            width: 100%;
            color: #fff;
            font-weight: 200;
            opacity: 0.9;
            font-size: 18px;
            overflow: hidden; }

        .login-left .title {
            margin-top: 60px;
            text-align: center;
            color: #fff;
            font-weight: 300;
            letter-spacing: 2px;
            font-size: 25px; }

        .login-border {
            border-left: none;
            border-top-right-radius: 5px;
            border-bottom-right-radius: 5px;
            color: #fff;
            background-color: #fff;
            width: 50%;
            float: left;
            -webkit-box-sizing: border-box;
            box-sizing: border-box; }

        .login-smain {
            margin: 0 auto;
            width: 65%;
            -webkit-box-sizing: border-box;
            box-sizing: border-box; }

        .login-smain > h3 {
            margin-bottom: 20px; }

        .login-smain > p {
            color: #76838f; }

        .login-title {
            color: #333;
            margin-bottom: 40px;
            font-weight: 500;
            font-size: 22px;
            text-align: center;
            letter-spacing: 4px; }

        .login-select input {
            color: #333;
            font-size: 18px;
            font-weight: 400;
            border: none;
            text-align: center; }

        .login-menu {
            margin-top: 40px;
            width: 100%;
            text-align: center; }
        .login-menu a {
            color: #999;
            font-size: 12px;
            margin: 0px 8px; }

        .login-submit {
            width: 100%;
            height: 45px;
            border: 1px solid #409eff;
            background: none;
            font-size: 18px;
            letter-spacing: 2px;
            font-weight: 300;
            color: #409eff;
            cursor: pointer;
            margin-top: 30px;
            font-family: "neo";
            -webkit-transition: 0.25s;
            transition: 0.25s; }

        .login-form {
            margin: 10px 0; }
        .login-form i {
            color: #333; }
        .login-form .el-form-item__content {
            width: 100%; }
        .login-form .el-form-item {
            margin-bottom: 12px; }
        .login-form .el-input input {
            padding-bottom: 10px;
            text-indent: 5px;
            background: transparent;
            border: none;
            border-radius: 0;
            color: #333;
            border-bottom: 1px solid #ebedf2; }
        .login-form .el-input .el-input__prefix i {
            padding: 0 5px;
            font-size: 16px !important; }

        .login-code {
            display: -webkit-box;
            display: -ms-flexbox;
            display: flex;
            -webkit-box-align: center;
            -ms-flex-align: center;
            align-items: center;
            -ms-flex-pack: distribute;
            justify-content: space-around;
            margin: 0 0 0 10px; }

        .login-code-img {
            margin-top: 2px;
            width: 100px;
            height: 38px;
            background-color: #fdfdfd;
            border: 1px solid #f0f0f0;
            color: #333;
            font-size: 14px;
            font-weight: bold;
            letter-spacing: 5px;
            line-height: 38px;
            text-indent: 5px;
            text-align: center; }

    </style>
</head>
<body>


<div class="login-container">
    <div class="login-weaper  animated bounceInDown">
        <div class="login-left">
            <img src="${vipRoot}/vip/frame/logo@3x.png" alt="" class="img">
            <p class="title">蚕食生活超市</p>
<#--            <p>©2019 v2.6.4</p>-->
        </div>
        <div class="login-border">
            <div class="login-smain">
                <div class="login-main" style="position: absolute;">
                    <#if content == "">
                        <header class="layui-elip" style="color: #000000">${info.title!""}</header>
                        <form class="layui-form" action="${info.actionUrl!""}" method="post">
                            <div class="layui-input-inline">
                                <input type="text" name="username" required style="border-radius: 10px;"
                                       lay-verify="required"
                                       value="${info.userName!""}"
                                       placeholder="用户名" autocomplete="off"
                                       class="layui-input">
                            </div>
                            <div class="layui-input-inline">
                                <input type="password" name="pwd" required style="border-radius: 10px;"
                                       lay-verify="required" placeholder="密码"
                                       autocomplete="off"
                                       value="${info.pwd!""}"
                                       class="layui-input">
                            </div>
                            <div class="layui-inline">
                                <span style="color: red">${info.msg!""}</span>
                            </div>
                            <div class="layui-input-inline login-btn">
                                <button type="submit" class="layui-btn">登录</button>
                            </div>
                            <hr/>


                        </form>
                    <#else>
                        ${content}
                    </#if>

                </div>
            </div>
        </div>
    </div>
</div>

    <#include "./body_js_tpl.ftl"/>

<script type="text/javascript">

</script>
</body>
</html>