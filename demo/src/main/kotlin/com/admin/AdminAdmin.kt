package com.admin

import com.example.demo.yewu.Admin
import com.example.demo.yewu.Page
import com.example.demo.yewu.Status
import kotlinx.html.*
import kotlinx.html.stream.createHTML
import vip.xuejike.ktpl.PageJkKtView
import vip.xuejike.ktpl.libs.*

class AdminAdminIndexView(var page: Page<Admin>, var query: Admin? = null) : PageJkKtView() {
    override fun content(): String {
        return createHTML().div {
            jkForm(method = FormMethod.get) {
                jkFormItem {
                    div {
                        jkInput("用户名", formItem = false
                                , inline = true, bind = query!!::userName)
                        jkButton("搜索")
                        jkButton("清空", type = JkButtonType.reset)
                        jkButton("添加",type = JkButtonType.dialog,url = "/admin/admin/edit")
                    }
                }
            }

            var i = 1
            jkTable(linkedMapOf(
                    "序号" to JkTableCol {
                        text(i)
                        i++
                    },
                    "用户名" to JkTableCol(Admin::userName),
                    "姓名" to JkTableCol(Admin::name),
                    "手机号" to JkTableCol(Admin::mobile),
                    "创建时间" to JkTableCol(Admin::createTime),
                    "状态" to JkTableCol{
                        if (it.status!=null){
                            text(it.status.cn())
                        }
                    },
                    "操作" to JkTableCol {
                        jkButton("编辑",type = JkButtonType.dialog
                                ,url = "/admin/admin/edit?id=${it.id}")

                        if (it.status== Status.open){
                            jkButton(title= "禁用",url = "/admin/admin/updateStatus?id=${it.id}"
                                    ,type = JkButtonType.confirm.name,option = "确定要禁用吗？"){
                                val btn=this as BUTTON
                                btn.classes+="layui-btn-danger"
                            }
                        }else if (it.status==Status.close){
                            jkButton(title= "启用",url = "/admin/admin/updateStatus?id=${it.id}"
                                    ,type = JkButtonType.confirm.name,option = "确定要启用吗？"){
                                val btn=this as BUTTON
                                btn.classes+="layui-btn-danger"
                            }
                        }
                        jkButton(title = "删除",url = "/admin/admin/del?id=${it.id}",type = JkButtonType.confirm,option = "您确定要删除吗"){
                            val btn=this as BUTTON
                            btn.classes+="layui-btn-danger"
                        }
                    }
            ), dataList = page.list)
            jkPage(page.pageCurrent, page.total.toInt())
        }
    }
}


class AdminAdminEditView(var vo: Admin):PageJkKtView(){
    override fun content(): String {
        return createHTML().div {
            val url: String = if (vo.id==null){
                "/admin/admin/addSave"
            }else{
                "/admin/admin/editSave"
            }
            jkForm(action = url) {
                jkInput(formItem = false,bind = vo::id,type = InputType.hidden)
                jkInput("用户名",bind = vo::userName,inputCall = {
                    it.attributes["lay-verify"] = "required"
                })
                jkInput("姓名",bind = vo::name,inputCall = {
                    it.attributes["lay-verify"] = "required"
                })
                jkInput("手机号",bind = vo::mobile,inputCall = {
                    it.attributes["lay-verify"] = "required"
                })
                jkInput("密码",bind = vo::pwd,inputCall = {
                    it.attributes["lay-verify"] = "required"
                })
                jkFormTitle {
                    jkButton("保存",type = JkButtonType.ajax_submit)
                }
            }
        }
    }

}
