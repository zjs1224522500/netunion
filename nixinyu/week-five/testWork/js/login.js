window.onload = function () {
      // 获取表单与事件

        var username = document.getElementById("username");
        var password = document.getElementById("password");

        // 获取事件按钮
        var LoginBtn = document.getElementById("LoginBtn")

        getData(username,password,LoginBtn)


        // 注册跳转
        var RegisterHref = document.getElementById("RegisterHref")
        RegisterHref.onclick = function () {
        location.href = "register.html"
    }
}



function getData(username,password,LoginBtn){
    // 1.声明异步请求对象
    var xmlHttp = null;
    if(window.ActiveXObject){
        // IE
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    else if(window.XMLHttpRequest){
        xmlHttp = new XMLHttpRequest()
    }
    // 2.如果实例化成功，就调用open()方法
    if(xmlHttp!=null){
        xmlHttp.open("get","data/data.json");
        //xmlHttp.open("post","http://training.shunzi.tech/login",true);
        xmlHttp.send(null);
        xmlHttp.onreadystatechange = doResult;
    }

    function doResult(){
        if(xmlHttp.readyState ==4){
            if(xmlHttp.status ==200){
                LoginBtn.onclick = function (){
                    // 基本判断

                    if(username.value == null || username.value == ""){
                        alert("用户名不能为空！")
                    }else if(password.value == null || password.value == ""){
                        alert("密码不能为空！")
                    }else {
                        // 获取数据
                        alert(xmlHttp.responseText)
                        var data = JSON.parse(xmlHttp.responseText)
                        if(data["username"] == username.value && data["password"] == password.value){
                            alert("登录成功！")
                            location.href = "http://training.shunzi.tech/index.html"
                        }else{
                            alert("登录失败！")
                        }
                    }
                }
            }
        }
    }
}
