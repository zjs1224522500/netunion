require('../css/index.css');
const index = `
<div class="declare">
    <ul>
        <li class="cpucolor1"><i>CPU</i>&nbsp;&nbsp;<b>——</b></li>
        <li class="powercolor1"><i>POWER</i>&nbsp;&nbsp;<b>——</b></li>
        <li class="RAMcolor1"><i>RAM</i>&nbsp;&nbsp;<b>——</b></li>
        <li class="fancolor1"><i>FAN</i>&nbsp;&nbsp;<b>——</b></li>
        <li class="panelcolor1"><i>PANEL</i>&nbsp;&nbsp;<b>——</b></li>
        <li class="HDDcolor1"><i>HDD</i>&nbsp;<b>——</b></li>
        <li class="SSDcolor1"><i>SSD</i>&nbsp;&nbsp;<b>——</b></li>
        <li class="CDcolor1"><i>CD</i>&nbsp;&nbsp;<b>——</b></li>
        <li class="videoCcolor1"><i>VIDEOC</i>&nbsp;&nbsp;<b>——</b></li>
    </ul>
</div>

<div class="product">
    <ul>
        <li><button name="add">CPU:Inter core i5 7500</button></li>
        <li><button name="add">POWER:某品牌</button></li>
        <li><button name="add">RAM:Glxy 8G*2</button></li>
        <li><button name="add">FAN:innate</button></li>
        <li><button name="add">PANEL:Asus H81</button></li>
        <li><button name="add">HDD:WD 500G</button></li>
        <li><button name="add">SSD:TECLAST 120G</button></li>
        <li><button name="add">RAM:Glxy 8G*1</button></li>
        <li><button name="add">FAN:某品牌</button></li>
        <li><button name="add">PANEL:MSI H91</button></li>
        <li><button name="add">HDD:Seagate 1T</button></li>
        <li><button name="add">SSD:Kingston 120G</button></li>
        <li><button name="add">CD:某名牌</button></li>
        <li><button name="add">VIDEOC:NVIDIA 1050Ti</button></li>
        <li><button name="add">VIDEOC:AMD 1060Ti</button></li>
    </ul>
</div>

<div class="rightBox">
    <h2>已选择的配件：</h2>
    <hr/>
    <div class="PC">
        <div id="cpu_container"></div>
        <div id="power_container"></div>
        <div id="RAM_container"></div>
        <div id="fan_container"></div>
        <div id="panel_container"></div>
        <div id="HDD_container"></div>
        <div id="SSD_container"></div>
        <div id="CD_container"></div>
        <div id="videoC_container"></div>
    </div>
</div>
`

const root = document.createElement('div');
document.body.appendChild(root);
document.getElementsByTagName('div')[0].innerHTML = index;


var d = document.getElementsByName('add');
    for(var i = 0;i<d.length;i++){
        d[i].addEventListener('click',t);
    }
    function t(event) {
        // 查找该节点的字符
        var content = event.target.innerHTML;
        var arr = content.split(':');
        switch(arr[0])
        {
            case 'CPU':
                var CPUDiv = document.getElementById('cpu_container');
                blink(CPUDiv,'cpucolor CPU','cpu',arr);
                break;
            case 'POWER':
                var powerDiv = document.getElementById('power_container');
                blink(powerDiv,'powercolor power','POWER',arr);
                break;
            case 'RAM':
                var RAMDiv = document.getElementById('RAM_container');
                blink(RAMDiv,'RAMcolor RAM','RAM',arr);
                break;
            case 'PANEL':
                var PANELDiv = document.getElementById('panel_container');
                blink(PANELDiv,'panelcolor panel','PANEL',arr);
                break;
            case 'HDD':
                var HDDlDiv = document.getElementById('HDD_container');
                blink(HDDlDiv,'HDDcolor HDD','HDD',arr);
                break;
            case 'FAN':
                var fanDiv = document.getElementById('fan_container');
                blink(fanDiv,'fancolor fan','fan',arr);
                break;
            case 'SSD':
                var SSDDiv = document.getElementById('SSD_container');
                blink(SSDDiv,'SSDcolor SSD','SSD',arr);
                break;
            case 'CD':
                var CDDiv = document.getElementById('CD_container');
                blink(CDDiv,'CDcolor CD','CD',arr);
                break;
            case 'VIDEOC':
                var videoCDiv = document.getElementById('videoC_container');
                blink(videoCDiv,'videoCcolor videoC','VIDEOC',arr);
                break;
            default:
                alert('...');
        }

    }


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

