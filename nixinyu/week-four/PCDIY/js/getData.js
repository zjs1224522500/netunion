// ajax = 获取数据
function loadXMLDoc()
{
    var xmlhttp;
    if (window.XMLHttpRequest)
    {
        //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
        xmlhttp=new XMLHttpRequest();
    }
    else
    {
        // IE6, IE5 浏览器执行代码
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.open("GET","data/data.json",true);
    xmlhttp.send();
    xmlhttp.onreadystatechange=function()
    {
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
        {
            //document.getElementById("myDiv").innerHTML=xmlhttp.responseText;

            var r = eval("("+xmlhttp.responseText+")");
            getData(r);
            listen();
        }
    }
}
loadXMLDoc()


function getData(json){
    var html  = document.getElementById('product');
    var arr = new Array();
    for(var i in json){
        html.innerHTML += `
            <li class="form-inline">
                <input type="text" class="form-control" value="`+json[i]+`" />
                <button name="add" class="btn btn-default">+</button>
            </li>
        `;
    }

}