window.onload = function () {
    var username = document.getElementById("username")
    var password = document.getElementById("password")
    var repassword = document.getElementById("repassword")
    var phonenumber = document.getElementById("phonenumber")
    var email = document.getElementById("email")


    // 注册跳转
    var LoginHref = document.getElementById("LoginHref")
    LoginHref.onclick = function () {
        location.href = "login.html"
    }

    // 提交验证
    function verify(){
        if(username.value == "" || password.value == "" || phonenumber.value == "" || email.value == ""){
            alert("表单不能有空项！")
            return false;
        }else if (username.value.length < 6 || username.value.length > 12){
            alert("用户名长度在6~12之间！")
            return false;
        }else if(password.value != repassword.value){
            alert("两次密码不一致！")
            return false;
        }else if(phonenumber.value.length != 11){
            alert("手机号码长度没到11位！")
            return false
        }
        return true
    }
    // 事件节点
    var subMit = document.getElementById("subMit")

    var jsonData = {
        "username":username.value,
        "password":password.value,
        "phonenumber":phonenumber.value,
        "e-mail":email.value
    }
    subMit.onclick = function () {
        var b = verify();
        if(b){
            getData(jsonData);
        }
    }
}

function getData(jsonData){
    // 1.声明异步请求对象
    var xmlHttp = null;
    if(window.ActiveXObject){
        // IE
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    else if(window.XMLHttpRequest){
        xmlHttp = new XMLHttpRequest()
    }
    if(xmlHttp!=null){
        xmlHttp.open("post","http://training.shunzi.tech/regist?jsonData=",true);
        xmlHttp.send(jsonData);
        xmlHttp.onreadystatechange = doResult;
    }

    function doResult(){
            if(xmlHttp.readyState ==4){
            if(xmlHttp.status ==200){
                // alert(xmlHttp.responseText)
            }
        }
    }
}


