
var projectName = '致远汽车租赁系统';
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
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '租赁汽车',
	url: './pages/zulinqiche/list.html'
}, 

{
	name: '公告信息',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot3x0bo/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"业务员","menuJump":"列表","tableName":"yewuyuan"}],"menu":"业务员管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"汽车类型","menuJump":"列表","tableName":"qicheleixing"}],"menu":"汽车类型管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除","查看评论"],"menu":"租赁汽车","menuJump":"列表","tableName":"zulinqiche"}],"menu":"租赁汽车管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","删除"],"menu":"汽车租赁","menuJump":"列表","tableName":"qichezulin"}],"menu":"汽车租赁管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","删除"],"menu":"汽车归还","menuJump":"列表","tableName":"qicheguihai"}],"menu":"汽车归还管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除","报表","导出"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","删除"],"menu":"检查信息","menuJump":"列表","tableName":"jianchaxinxi"}],"menu":"检查信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","删除"],"menu":"押金支付","menuJump":"列表","tableName":"yajinzhifu"}],"menu":"押金支付管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","租赁"],"menu":"租赁汽车列表","menuJump":"列表","tableName":"zulinqiche"}],"menu":"租赁汽车模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","支付","汽车归还"],"menu":"汽车租赁","menuJump":"列表","tableName":"qichezulin"}],"menu":"汽车租赁管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"汽车归还","menuJump":"列表","tableName":"qicheguihai"}],"menu":"汽车归还管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","支付"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","支付"],"menu":"检查信息","menuJump":"列表","tableName":"jianchaxinxi"}],"menu":"检查信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","支付"],"menu":"押金支付","menuJump":"列表","tableName":"yajinzhifu"}],"menu":"押金支付管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","租赁"],"menu":"租赁汽车列表","menuJump":"列表","tableName":"zulinqiche"}],"menu":"租赁汽车模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","押金支付","审核"],"menu":"汽车租赁","menuJump":"列表","tableName":"qichezulin"}],"menu":"汽车租赁管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","租赁订单","检查信息"],"menu":"汽车归还","menuJump":"列表","tableName":"qicheguihai"}],"menu":"汽车归还管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","导出"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看"],"menu":"检查信息","menuJump":"列表","tableName":"jianchaxinxi"}],"menu":"检查信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","租赁"],"menu":"租赁汽车列表","menuJump":"列表","tableName":"zulinqiche"}],"menu":"租赁汽车模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"业务员","tableName":"yewuyuan"}]


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
