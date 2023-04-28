import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import zulinqiche from '@/views/modules/zulinqiche/list'
    import news from '@/views/modules/news/list'
    import qicheguihai from '@/views/modules/qicheguihai/list'
    import zulindingdan from '@/views/modules/zulindingdan/list'
    import storeup from '@/views/modules/storeup/list'
    import yewuyuan from '@/views/modules/yewuyuan/list'
    import qicheleixing from '@/views/modules/qicheleixing/list'
    import qichezulin from '@/views/modules/qichezulin/list'
    import yajinzhifu from '@/views/modules/yajinzhifu/list'
    import discusszulinqiche from '@/views/modules/discusszulinqiche/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jianchaxinxi from '@/views/modules/jianchaxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/zulinqiche',
        name: '租赁汽车',
        component: zulinqiche
      }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/qicheguihai',
        name: '汽车归还',
        component: qicheguihai
      }
      ,{
	path: '/zulindingdan',
        name: '租赁订单',
        component: zulindingdan
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/yewuyuan',
        name: '业务员',
        component: yewuyuan
      }
      ,{
	path: '/qicheleixing',
        name: '汽车类型',
        component: qicheleixing
      }
      ,{
	path: '/qichezulin',
        name: '汽车租赁',
        component: qichezulin
      }
      ,{
	path: '/yajinzhifu',
        name: '押金支付',
        component: yajinzhifu
      }
      ,{
	path: '/discusszulinqiche',
        name: '租赁汽车评论',
        component: discusszulinqiche
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jianchaxinxi',
        name: '检查信息',
        component: jianchaxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
