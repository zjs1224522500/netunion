window.onload = function (){
    function listen(){
        var d = document.getElementsByName('add');
        for(var i = 0;i<d.length;i++){
            d[i].addEventListener('click',t);
        }
    }
    var all = ['','','','','','','','',''];
    function t(event) {
        // 查找该节点的字符
        //alert(event.target.parentNode.children.length);
        var content = event.target.parentNode.children[0].value;  // 获取上一个节点的value
        var arr = content.split(':');
        switch(arr[0])
        {
            case 'CPU':
                var CPUDiv = document.getElementById('cpu_container');
                blink(CPUDiv,'cpucolor CPU','cpu',arr);
                var c = document.getElementsByClassName('cpucolor1')[0].style.color = '#d64f44';
                all[0] = content;
                break;
            case 'POWER':
                var powerDiv = document.getElementById('power_container');
                blink(powerDiv,'powercolor power','POWER',arr);
                var c = document.getElementsByClassName('powercolor1')[0].style.color = '#843900';
                all[1] = content;
                break;
            case 'RAM':
                var RAMDiv = document.getElementById('RAM_container');
                blink(RAMDiv,'RAMcolor RAM','RAM',arr);
                var c = document.getElementsByClassName('RAMcolor1')[0].style.color = '#769149';
                all[2] = content;
                break;
            case 'PANEL':
                var PANELDiv = document.getElementById('panel_container');
                blink(PANELDiv,'panelcolor_unboot panel_unboot','PANEL',arr);
                var c = document.getElementsByClassName('panelcolor1')[0].style.color = '#dea32c';
                all[3] = content;
                break;
            case 'HDD':
                var HDDlDiv = document.getElementById('HDD_container');
                blink(HDDlDiv,'HDDcolor HDD','HDD',arr);
                var c = document.getElementsByClassName('HDDcolor1')[0].style.color = '#e0861a';
                all[4] = content;
                break;
            case 'FAN':
                var fanDiv = document.getElementById('fan_container');
                blink(fanDiv,'fancolor fan','fan',arr);
                var c = document.getElementsByClassName('fancolor1')[0].style.color = '#8552a1';
                all[5] = content;
                break;
            case 'SSD':
                var SSDDiv = document.getElementById('SSD_container');
                blink(SSDDiv,'SSDcolor SSD','SSD',arr);
                var c = document.getElementsByClassName('SSDcolor1')[0].style.color = '#decb00';
                all[6] = content;
                break;
            case 'CD':
                var CDDiv = document.getElementById('CD_container');
                blink(CDDiv,'CDcolor CD','CD',arr);
                var c = document.getElementsByClassName('CDcolor1')[0].style.color = '#65c294';
                all[7] = content;
                break;
            case 'VIDEOC':
                var videoCDiv = document.getElementById('videoC_container');
                blink(videoCDiv,'videoCcolor videoC','VIDEOC',arr);
                var c = document.getElementsByClassName('videoCcolor1')[0].style.color = '#228fbd';
                all[8] = content;
                break;
            default:
                alert('请保留类别前缀！');
                event.target.parentNode.children[0].value = '';
                event.target.parentNode.children[0].placeholder = '如（CPU:你所选择的品牌）';
        }

    }

    /*
    * 显示一下选好的配件
    * */
        document.getElementById('get1').onclick = function(){
        document.getElementById('CPU_t').innerHTML = all[0];
        document.getElementById('POWER_t').innerHTML = all[1];
        document.getElementById('RAM_t').innerHTML = all[2];
        document.getElementById('PANEL_t').innerHTML = all[3];
        document.getElementById('HDD_t').innerHTML = all[4];
        document.getElementById('FAN_t').innerHTML = all[5];
        document.getElementById('SSD_t').innerHTML = all[6];
        document.getElementById('CD_t').innerHTML = all[7];
        document.getElementById('VIDEOC_t').innerHTML = all[8];
        document.getElementById('show').style.display = 'block';
        var a = 0;
        var r = setInterval(function(){
            a += 0.04;
            document.getElementById('show').style.opacity = a;
            if(a>1){
                clearInterval(r);
            }
        },50);
}

/*
* 关闭这个显示框继续选择
* */
document.getElementById('close').onclick = function(){
    var a = 1;
    var r = setInterval(function(){
        a -= 0.09;
        document.getElementById('show').style.opacity = a;
        if(a<0.1){
            clearInterval(r);
            document.getElementById('show').style.display = 'none';
        }
    },50);

};

/*
* 打印所选择的的配件
* */
document.getElementById('print').onclick = function(){
    document.body.innerHTML = document.getElementById('print_value').innerHTML;
    window.print();
}

/*
* 获取地图位置
* */
var map_Div =  document.getElementById('Map_Div');
var map =  document.getElementById('Map_Chile');
var close_map_btn = document.getElementById('close_map');
document.getElementById('get_map').onclick = function(){
    map_Div.style.display = 'block';
    var mapDiv = document.createElement('iframe');

    mapDiv.setAttribute('id','map');
    mapDiv.setAttribute('src','http://uri.amap.com/marker?markers=104.092957,30.712999|104.095619,30.70724|104.095752,30.709446|104.059136,30.774004&src=mypage&coordinate=gaode&callnative=1')
    map.style.display = 'block';
    map.appendChild(mapDiv);
    close_map_btn.style.display = 'block';
    // 关闭地图
        close_map_btn.onclick = function () {
            map.innerHTML = '';
            map_Div.style.display = 'none';
    }
}



    /*
        obj = 容器对象
        str = class 样式
        divId = 容器子节点选择器
        arr = 按钮上的分割的数组
     */
    function blink(obj,str,divId,arr){
        var cpuDiv = document.createElement('div');

        cpuDiv.setAttribute('class',str);
        cpuDiv.setAttribute('id',divId);
        cpuDiv.innerHTML = arr[1];
        var a = 0;
        if(obj.childNodes.length == 0) {
            obj.appendChild(cpuDiv);
            var v = setInterval(function () {
                if(cpuDiv.style.visibility == "visible")
                    cpuDiv.style.visibility = "hidden";
                else
                    cpuDiv.style.visibility = "visible";
                a = a + 1;
                if(a > 10){
                    clearInterval(v);
                }
            },100);
        }else{
            a = 0;
            var cpuDiv2 = document.getElementById(divId);
            cpuDiv2.innerHTML = arr[1];
            var v = setInterval(function () {
                if(cpuDiv2.style.visibility == "visible")
                    cpuDiv2.style.visibility = "hidden";
                else
                    cpuDiv2.style.visibility = "visible";

                a = a + 1;
                if(a > 11){
                    clearInterval(v);
                }
            },100);
        }
    }

// ajax = 获取数据

    function getData(json){
        var arr_page2 = [[],[],[],[]];
        var arr_page1 = [];
        var html  = document.getElementById('product');
        var arr = new Array();
        var n = 0;
        for(var i in json){
            arr_page1.push(`
            <li class="form-inline">
                <input type="text" class="form-control" value="`+json[i]+`" />
                <button name="add" class="btn btn-default">+</button>
            </li>
        `)
            if(i%7 == 0){
                n += 1
                arr_page2[n] = arr_page1;
                arr_page1 =[]
            }

        }
        //alert(arr_page2.length)
        for(var p = 0;p<arr_page2[1].length;p++){
            html.innerHTML += arr_page2[1][p];
        }




        var before_page = document.getElementById('before');
        var next_page =  document.getElementById('next');
        var k = 1;

        next_page.onclick = function(){
            html.innerHTML = '';
            if(k<arr_page2.length-1){
                k += 1;
            }
            if(k==arr_page2.length-1){
                alert('到最后一页了☺');
            }
            for(var u = 0;u<arr_page2[k].length;u++){
                html.innerHTML += arr_page2[k][u];
                //alert(arr_page2[k][u])
            }

            listen();
        }

        before_page.onclick = function(){
            html.innerHTML = '';
            if(k>1){
                k -= 1;
            }
            if(k==1){
                alert('到第一页了☺');
            }
            for(var l = 0;l<arr_page2[k].length;l++){
                html.innerHTML += arr_page2[k][l];
            }
            listen();

        }
    }

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
                var r = eval("("+xmlhttp.responseText+")");
                getData(r);
                listen();
            }
        }
    }
    loadXMLDoc()

}