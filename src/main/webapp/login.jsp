<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <script src="/SJOJ/js/jquery-3.1.1.js" type="text/javascript"></script>
<script src="/SJOJ/js/jquery.validate.js"  type="text/javascript"></script>
<script type="text/javascript">
function chageCode(){
    $('#codeImage').attr('src','authCode.do?abc='+Math.random());//链接后添加Math.random，确保每次产生新的验证码，避免缓存问题。
}

<!--页面加载时行成表单验证对象-->
<!--  $("#login").validate({ 
        rules:{
            name:{ required:true},
            password:{required:true},
            authCode:{required:true,checkCode:true}
        },
        messages:{
            name:{required:"姓名不能为空"},
            password:{required:"密码不能为空"},
            authCode:{required:"验证码不能为空"}
        }
    });
<!--然后添加自定义的验证码验证方法-->
<!--      jQuery.validator.addMethod("checkCode", function(value, element) {       
                var strCode = ${strCode!=""};
                //这里用的freemarke取到后台保存在session中的验证码字符。
                var inpCode = $('#authCode').val();
                if(strCode==""||strCode == null){
                    chageCode();
                    //用后台的字符与页面输入的验证码进行比较
                }else if(inpCode == strCode){
                    return true;
                }else{
                    return false;
                }
         }, "验证码不正确"); 
</script>-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<form action="login.do">
用户名：<input type="text" name="user_id">
密码：<input type="password" name="password">
<div class="form-group">
        验证码：<input id="authCode" name="authCode" type="text"/>
        <!--这里img标签的src属性的值为后台实现图片验证码方法的请求地址-->
        <label><img type="image" src="authCode.do" id="codeImage" onclick="chageCode()" title="图片看不清？点击重新得到验证码" style="cursor:pointer;"/></label>
        <label><a onclick="chageCode()">换一张</a></label>
    </div>
<input type="submit" value="登录"> 
<a href="register.jsp">注册</a>
</form>
<br>
<br>
<br>
<br>
<form action="toLogin.do" id="loginUser" method="post">
    <div class="form-group">
        姓名：<input id="name" name="name" type="text"/>
    </div>
    <div class="form-group">
        密码：<input id="password" name="password" type="password"/>
    </div>
    <div class="form-group">
        验证码：<input id="authCode" name="authCode" type="text"/>
        <!--这里img标签的src属性的值为后台实现图片验证码方法的请求地址-->
        <label><img type="image" src="authCode.do" id="codeImage" onclick="chageCode()" title="图片看不清？点击重新得到验证码" style="cursor:pointer;"/></label>
        <label><a onclick="chageCode()">换一张</a></label>
    </div>
    <input type="button" class="btn btn-default"  onclick="subm()" value="登录"/>
</form>

</body>
</html>