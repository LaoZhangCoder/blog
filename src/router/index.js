import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Detail from '@/components/Detail'
import Links from '@/components/Links'
import Aboutblog from '@/components/Aboutblog'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
path:'/detail/:id',
name:'Detail',
component: Detail

    },
    {
    	path:'/Links/',
    	name:'Links',
    	component:Links
    },
    {
      path:'/aboutblog/',
      name:'Aboutblog',
      component:Aboutblog
    }
  ]
})
