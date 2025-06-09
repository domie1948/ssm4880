
var projectName = '社区生活超市管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
]


var indexNav = [

{
	name: '商品信息',
	url: './pages/shangpinxinxi/list.jsp'
}, 

]

var adminurl =  "http://localhost:8080/jspm430pa/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"供应商","menuJump":"列表","tableName":"gongyingshang"}],"menu":"供应商管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商品类型","menuJump":"列表","tableName":"shangpinleixing"}],"menu":"商品类型管理"},{"child":[{"buttons":["查看","修改","删除","进货","退货","出库"],"menu":"商品信息","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","上架商品"],"menu":"供应商商品","menuJump":"列表","tableName":"gongyingshangshangpin"}],"menu":"供应商商品管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"商品进货","menuJump":"列表","tableName":"shangpinjinhuo"}],"menu":"商品进货管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"商品退货","menuJump":"列表","tableName":"shangpintuihuo"}],"menu":"商品退货管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"商品订单","menuJump":"列表","tableName":"shangpindingdan"}],"menu":"商品订单管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"用户退货","menuJump":"列表","tableName":"yonghutuihuo"}],"menu":"用户退货管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"销售出库","menuJump":"列表","tableName":"xiaoshouchuku"}],"menu":"销售出库管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商品盘点","menuJump":"列表","tableName":"shangpinpandian"}],"menu":"商品盘点管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"超市资讯","menuJump":"列表","tableName":"chaoshizixun"}],"menu":"超市资讯管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除","支付","退货"],"menu":"商品订单","menuJump":"列表","tableName":"shangpindingdan"}],"menu":"商品订单管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"用户退货","menuJump":"列表","tableName":"yonghutuihuo"}],"menu":"用户退货管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"供应商商品","menuJump":"列表","tableName":"gongyingshangshangpin"}],"menu":"供应商商品管理"},{"child":[{"buttons":["查看"],"menu":"商品进货","menuJump":"列表","tableName":"shangpinjinhuo"}],"menu":"商品进货管理"},{"child":[{"buttons":["查看"],"menu":"商品退货","menuJump":"列表","tableName":"shangpintuihuo"}],"menu":"商品退货管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"供应商","tableName":"gongyingshang"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
