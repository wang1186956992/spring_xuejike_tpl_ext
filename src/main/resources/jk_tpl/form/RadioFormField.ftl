<#-- @ftlvariable name="val" type="com.bidanet.springmvc.demo.jkbuilder.data.JkNameValueDataImpl" -->

    <label class="layui-form-label">${formField.title!}</label>
    <div class="layui-input-${layout!"block"}">
        <#if arrayData??>
            <#list arrayData as  val>
                <input type="radio" name="${formField.name}"

                    <#if formField.val??>
                        <#if "${formField.val?c}" == "${val.getValue()!}"> checked</#if>
                    </#if>

                       value="${val.getValue()!}" title="${val.getName()!}">
            </#list>
        </#if>

    </div>